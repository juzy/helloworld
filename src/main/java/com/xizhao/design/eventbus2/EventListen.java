package com.xizhao.design.eventbus2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * <p> Date: 13-5-27 Time: 上午10:03 </p>
 *
 * @author xizhao.xsz
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EventListen {
}
