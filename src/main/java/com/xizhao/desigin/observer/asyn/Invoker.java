package com.xizhao.desigin.observer.asyn;


/**
 * <p>
 * <p> Date: 13-5-21 Time: 上午9:53 </p>
 *
 * @author xizhao.xsz
 */
public class Invoker {
    private Observer o;
    Handler handler;

    public Invoker(Observer o) {
        new Handler();
        this.o = o;
    }

    private class Handler extends Thread {
        public Handler() {
            handler = this;
        }

        @Override
        public void run() {
            o.takeAction();
        }
    }

    public boolean testSameObserver(Observer o) {
        return o == this.o;
    }

    public void invoke(){
        handler.start();
    }

}
