package com.xizhao.design.eventbus2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <p>
 * <p> Date: 13-5-27 Time: 上午10:12 </p>
 *
 * @author xizhao.xsz
 */
public class XizhaoEventHandler {
    /**
     * Object sporting the handler method.
     */
    private final Object target;
    /**
     * Handler method.
     */
    private final Method method;

    XizhaoEventHandler(Object target, Method method) {
        XizhaoPreconditions.checkNotNull(target, "XizhaoEventHandler target can not be null");
        XizhaoPreconditions.checkNotNull(method, "XizhaoEventHandler method can not be null");
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }

    public void handleEvent(Object event) throws InvocationTargetException {
        XizhaoPreconditions.checkNotNull(event);
        try {
            method.invoke(target, event);
        } catch (IllegalAccessException e) {
            throw new Error("Method rejected target/argument: " + event, e);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof Error) {
                throw (Error) e.getCause();
            }
            throw e;
        }

    }
}
