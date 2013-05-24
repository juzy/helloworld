package com.xizhao.design.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * <p>
 * <p> Date: 13-5-23 Time: 下午2:52 </p>
 *
 * @author xizhao.xsz
 */
public class MultipleListener {
    @Subscribe
    public void listenInteger(Integer event) {
        System.out.println("MultipleListener.listenInteger.event=" + event);
    }

    @Subscribe
    public void listenLong(Long event) {
        System.out.println("MultipleListener.listenLong.event=" + event);
    }

    @Subscribe
    public void listenNumber(Number event) {
        System.out.println("MultipleListener.listenNumber.event=" + event);
    }
}
