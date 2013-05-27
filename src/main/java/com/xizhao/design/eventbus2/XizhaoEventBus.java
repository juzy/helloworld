package com.xizhao.design.eventbus2;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * <p> Date: 13-5-27 Time: 上午10:06 </p>
 *
 * @author xizhao.xsz
 */
public class XizhaoEventBus {

    /**
     * All registered event handlers, indexed by event type.
     * <p/>
     * <p>This SetMultimap is NOT safe for concurrent use; all access should be
     * made after acquiring a read or write lock via {@link #handlersByTypeLock}.
     */
    private final Map<Class<?>, List<XizhaoEventHandler>> handlersByType = new HashMap<Class<?>, List<XizhaoEventHandler>>();

    public void register(Object o) {

        HashMap<Class<?>, List<XizhaoEventHandler>> methodsInListener = findAllHandlers(o);
        handlersByType.putAll(methodsInListener);
    }

    public void post(Object o) throws InvocationTargetException {
        List<XizhaoEventHandler> list = (List<XizhaoEventHandler>) handlersByType.get(o.getClass());
        for (XizhaoEventHandler handler : list) {
            handler.handleEvent(o);
        }

    }

    private HashMap<Class<?>, List<XizhaoEventHandler>> findAllHandlers(Object listener) {
        HashMap<Class<?>, List<XizhaoEventHandler>> methodsInListener = new HashMap<Class<?>, List<XizhaoEventHandler>>();
        Class<?> clazz = listener.getClass();

        Map<String, Method> annotatedMethods = getAnnotatedMethods(clazz);
        for (Method method : annotatedMethods.values()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> eventType = parameterTypes[0];
            XizhaoEventHandler handler = makeHandler(listener, method);
            List<XizhaoEventHandler> handlerList = null;
            handlerList = methodsInListener.get(eventType);
            if (null == handlerList) {
                handlerList = new ArrayList<XizhaoEventHandler>();
            }
            handlerList.add(handler);
            methodsInListener.put(eventType, handlerList);
        }
        return methodsInListener;
    }


    void dispatch(Object event, XizhaoEventHandler wrapper) throws Exception {
        try {
            wrapper.handleEvent(event);
        } catch (InvocationTargetException e) {
            throw new Exception(e);

        }
    }
    //=========================private static fields start====================================

    private static Map<String, Method> getAnnotatedMethods(Class<?> clazz) {
        Map<String, Method> annotatedMethods = new HashMap<String, Method>();
        Method[] methodlist = clazz.getMethods();
        for (Method method : methodlist) {
            if (method.isAnnotationPresent(EventListen.class)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new IllegalArgumentException("Method " + method
                            + " has @EventListen annotation, but requires " + parameterTypes.length
                            + " arguments.  XizhaoEventhandler methods must require a single argument.");
                }
                annotatedMethods.put(method.getName(), method);
            }
        }
        return annotatedMethods;
    }

    private static XizhaoEventHandler makeHandler(Object listener, Method method) {
        XizhaoEventHandler handler;
        handler = new XizhaoEventHandler(listener, method);
        return handler;
    }
    //=========================private static fields end====================================
}
