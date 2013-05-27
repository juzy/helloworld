package com.xizhao.design.eventbus2;

/**
 * <p>
 * <p> Date: 13-5-27 Time: 上午10:14 </p>
 *
 * @author xizhao.xsz
 */
public class XizhaoPreconditions {
    public static <T> T checkNotNull(T reference, Object errorMessage) {
        if (null == reference) {
            throw new NullPointerException(String.valueOf(errorMessage));
        }
        return reference;
    }

    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }
}
