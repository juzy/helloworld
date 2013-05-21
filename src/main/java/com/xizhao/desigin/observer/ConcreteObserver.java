package com.xizhao.desigin.observer;

/**
 * <p>
 * <p> Date: 13-5-20 Time: ÏÂÎç4:44 </p>
 * Observer Pattern's disadvantages:<br/>
 * we must think of the  efficiency .One subject has many Observers.If an Observer is blocking,others must wait for it.<br/>
 * In this case,we consider using  asynchronus
 *
 * @author xizhao.xsz
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    @Override
    public void update(String state) {

        observerState = state;
        System.out.println("¸üÐÂ×´Ì¬" + observerState);
    }

}
