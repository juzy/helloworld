package com.xizhao.design.event;

import lombok.Setter;

/**
 * <p>
 * <p> Date: 13-5-23 Time: 上午10:02 </p>
 * 没发现这样的event/listener模式有什么好处，这个就是在create中，封装了event和listener嘛。
 * listener完全没监听，全靠action主动调用
 *
 * @author xizhao.xsz
 */
public class MyCreateAction {
    private
    @Setter
    MyListener myListener;
    private static MyEvent myEvent;

    private void handleListener(MyEvent myEvent) {
        this.myListener.handle(myEvent);
    }

    public void execute() {
        myEvent = new MyCreateEventImpl();
        this.handleListener(myEvent);
        System.out.println("create end!");
    }


    //调用被监听的类，测试监听效果
    public static void main(String[] args) {
        MyCreateAction action = new MyCreateAction();
        MyListenerImpl myListener = new MyListenerImpl();
        //设置监听器的实现
        action.setMyListener(myListener);
        action.execute();
    }


}
