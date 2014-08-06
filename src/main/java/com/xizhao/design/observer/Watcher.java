package com.xizhao.design.observer;

import java.util.Observable;

/**
 * <p>
 * <p> Date: 13-5-20 Time: 下午5:27 </p>
 *
 * @author xizhao.xsz
 */
public class Watcher implements java.util.Observer {
    public Watcher(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("the state is changed:" + ((Watched) o).getData());
    }
}
