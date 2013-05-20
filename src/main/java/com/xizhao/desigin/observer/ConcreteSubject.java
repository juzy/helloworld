package com.xizhao.desigin.observer;

import lombok.Getter;

/**
 * <p>
 * <p> Date: 13-5-20 Time: ä¸‹åˆ4:42 </p>
 *
 * @author xizhao.xsz
 */
public class ConcreteSubject extends Subject {
    private
    @Getter
    String state;

    public void change(String newState) {
        state = newState;
        System.out.println("Ö÷Ìâ×´Ì¬Îª" + state);
        this.notifyObservers(state);
    }
}
