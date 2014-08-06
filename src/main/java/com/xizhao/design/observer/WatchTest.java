package com.xizhao.design.observer;

/**
 * <p>
 * <p> Date: 13-5-20 Time: 下午5:28 </p>
 *
 * @author xizhao.xsz
 */
public class WatchTest {
    public static void main(String[] args) {

        //创建被观察者对象
        Watched watched = new Watched();
        //创建观察者对象，并将被观察者对象登记
        java.util.Observer watcher = new Watcher(watched);
        java.util.Observer watcher2 = new Watcher(watched);
        //给被观察者状态赋值
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");
    }
}
