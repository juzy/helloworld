package com.xizhao.design.observer.asyn;

/**
 * <p>
 * <p> Date: 13-5-21 Time: 上午10:21 </p>
 *
 * @author xizhao.xsz
 */
public class ObserverB implements Observer {
    @Override
    public void takeAction() {
        System.out.println("I am Observer B ,i was told to do something");
    }
}
