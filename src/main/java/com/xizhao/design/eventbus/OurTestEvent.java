package com.xizhao.design.eventbus;

/**
 * <p>
 * <p> Date: 13-5-23 Time: 上午11:18 </p>
 *
 * @author xizhao.xsz
 */
public class OurTestEvent {

    private final int message;

    public OurTestEvent(int message) {
        this.message = message;
    }

    public int getMessage() {
        return message;
    }
}
