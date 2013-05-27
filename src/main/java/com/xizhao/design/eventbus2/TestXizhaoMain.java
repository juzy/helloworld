package com.xizhao.design.eventbus2;

import java.lang.reflect.InvocationTargetException;

/**
 * <p>
 * <p> Date: 13-5-27 Time: 下午3:42 </p>
 *
 * @author xizhao.xsz
 */
public class TestXizhaoMain {
    public static void main(String[] args) throws InvocationTargetException {
        XizhaoEventBus bus = new XizhaoEventBus();
        bus.register(new TestXizhaoListen());
        bus.post(new TestXizhaoEvent(5));
        bus.post(new TestXizhaoEvent(6));

    }

}
