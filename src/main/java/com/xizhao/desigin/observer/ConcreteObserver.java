package com.xizhao.desigin.observer;

/**
 * <p>
 * <p> Date: 13-5-20 Time: ÏÂÎç4:44 </p>
 *
 * @author xizhao.xsz
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    @Override
    public void update(String state) {

        observerState = state;
        System.out.println("¸üĞÂ×´Ì¬" + observerState);
    }

}
