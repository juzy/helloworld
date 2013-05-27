package com.xizhao.design.eventbus2;

/**
 * <p>
 * <p> Date: 13-5-27 Time: 下午3:46 </p>
 *
 * @author xizhao.xsz
 */
public class TestXizhaoEvent {
    private final int message;

    public TestXizhaoEvent(int message) {
        this.message = message;
    }

    public int getMessage() {
        return message;
    }
}
