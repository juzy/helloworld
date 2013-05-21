package com.xizhao.desigin.observer.asyn;

/**
 * <p>
 * <p> Date: 13-5-21 Time: 上午10:20 </p>
 *
 * @author xizhao.xsz
 */
public class ObserverA implements Observer {
    @Override
    public void takeAction() {
        System.out.println("I am Observer A ,state changed ,so i have to do something");
    }
}
