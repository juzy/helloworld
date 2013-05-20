package com.xizhao.desigin.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * <p> Date: 13-5-20 Time: 下午4:33 </p>
 *
 * @author xizhao.xsz
 */
public abstract class Subject {
    private List<Observer> list = new ArrayList<Observer>();
    public void attatch(Observer observer){
        list.add(observer);
        System.out.println("Attached a new observer");
    }
    public void detach(Observer observer){
        list.remove(observer);
    }
    public void notifyObservers(String newState){
        for(Observer observer :list){
            observer.update(newState);
        }
    }

}
