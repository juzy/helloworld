package com.xizhao.desigin.observer;

import lombok.Getter;

/**
 * <p>
 * <p> Date: 13-5-20 Time: 下午4:42 </p>
 *
 * @author xizhao.xsz
 */
public class ConcreteSubject extends Subject {
    private
    @Getter
    String state;

    public void change(String newState) {
        state = newState;
        System.out.println("主题状态为" + state);
        this.notifyObservers(state);
    }
}
