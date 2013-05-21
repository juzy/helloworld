package com.xizhao.desigin.observer.asyn;

/**
 * <p>
 * <p> Date: 13-5-21 Time: 上午10:21 </p>
 *
 * @author xizhao.xsz
 */
public class ObserverC implements Observer {
    @Override
    public void takeAction() {
        System.out.println("I am Observer C ,i was told to do something");

    }
}
