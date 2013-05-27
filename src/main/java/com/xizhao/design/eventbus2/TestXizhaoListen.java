package com.xizhao.design.eventbus2;

import lombok.Getter;

/**
 * <p>
 * <p> Date: 13-5-27 Time: 下午3:43 </p>
 *
 * @author xizhao.xsz
 */
public class TestXizhaoListen {
    @Getter
    public int lastMessage = 0;

    @EventListen
    public void listen(TestXizhaoEvent event) {
        lastMessage = event.getMessage();
        System.out.println("EventListener get the event.The message is " + lastMessage);
    }

    @EventListen
    public void listenTestAgain(TestXizhaoEvent event) {
        System.out.println("EventListener get the event again lalala.The message is " + event.getMessage());
    }

}
