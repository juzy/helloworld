package com.xizhao.design.event;

/**
 * <p>
 * <p> Date: 13-5-22 Time: 下午2:33 </p>
 *
 * @author xizhao.xsz
 */
public class MyListenerImpl implements MyListener {
    @Override
    public void handle(final MyEvent myEvent) {
        if (myEvent.getEvent().equalsIgnoreCase(MyEvent.createEvent)) {
            System.out.println("myListener get a create event!");
        } else if (myEvent.getEvent().equalsIgnoreCase(MyEvent.deleteEvent)) {
            System.out.println("myListener get a delete event!");
        } else if (myEvent.getEvent().equalsIgnoreCase(MyEvent.updateEvent)) {
            System.out.println("myListener get a update event!");
        }
    }

}
