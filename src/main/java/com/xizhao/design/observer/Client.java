package com.xizhao.design.observer;

/**
 * <p>
 * <p> Date: 13-5-20 Time: обнГ4:46 </p>
 *
 * @author xizhao.xsz
 */
public class Client {
    public static void  main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.attatch(observer);
        subject.change("new state");
    }
}
