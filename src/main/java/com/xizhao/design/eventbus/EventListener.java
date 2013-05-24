package com.xizhao.design.eventbus;

import com.google.common.eventbus.Subscribe;
import lombok.Getter;

/**
 * <p>
 * <p> Date: 13-5-23 Time: 上午11:16 </p>
 *
 *
 * @author xizhao.xsz
 */
public class EventListener {
    @Getter
    public int lastMessage = 0;

    @Subscribe
    public void listen(OurTestEvent event) {
        lastMessage = event.getMessage();
        System.out.println("EventListener get the event.The message is "+lastMessage);
    }
}
