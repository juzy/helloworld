package com.xizhao.design.eventbus;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

/**
 * <p>
 * <p> Date: 13-5-23 Time: 下午3:02 </p>
 * 如果没有消息订阅者监听消息, EventBus将发送DeadEvent消息, 这时我们可以通过log的方式来记录这种状态
 *
 * @author xizhao.xsz
 */
public class DeadEventListener {
    boolean notDelivered = false;

    @Subscribe
    public void listen(DeadEvent event) {
        notDelivered = true;
        System.out.println("DeadEventListener get deadEvent");
    }

    public boolean isNotDelivered() {
        return notDelivered;
    }
}
