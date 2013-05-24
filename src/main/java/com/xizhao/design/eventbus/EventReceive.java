package com.xizhao.design.eventbus;

import com.google.common.eventbus.EventBus;

/**
 * <p>
 * <p> Date: 13-5-23 Time: 下午2:17 </p>
 *
 * @author xizhao.xsz
 */
public class EventReceive {
    public void shouldReceiveEvent() {
        EventBus eventBus = new EventBus();
        EventListener listener = new EventListener();
        eventBus.register(listener);
        eventBus.post(new OurTestEvent(200));
    }

    public void shouldReceiveMutipleEvent() {
        EventBus eventBus = new EventBus();
        eventBus.register(new MultipleListener());
        eventBus.post(new Integer(2));
        eventBus.post(new Long(400));
    }

    public void shouldDetectEventWithoutListeners() {
        EventBus eventBus = new EventBus();
        DeadEventListener deadEventListener = new DeadEventListener();
        eventBus.register(deadEventListener);
        eventBus.post(new OurTestEvent(200));

    }

    public static void main(String[] args) {
        new EventReceive().shouldReceiveMutipleEvent();

    }
}
