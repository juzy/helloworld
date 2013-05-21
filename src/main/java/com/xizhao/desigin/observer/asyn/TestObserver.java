package com.xizhao.desigin.observer.asyn;

/**
 * <p>
 * <p> Date: 13-5-21 Time: 上午10:22 </p>
 *
 * @author xizhao.xsz
 */
public class TestObserver {
    public static void main(String[] args){
        ObserverA a  = new ObserverA();
        ObserverB b  = new ObserverB();
        ObserverC c  = new ObserverC();
        ObservedObject oo = new ObservedObject();
        oo.addObserver(a);
        oo.addObserver(b);
        oo.addObserver(c);
        for(int i=0;i<5;i++){
            oo.addObserver(new Observer() {
                @Override
                public void takeAction() {
                    System.out.println("I am temp Observer") ;
                }
            });
        }
        oo.update();
    }
}
