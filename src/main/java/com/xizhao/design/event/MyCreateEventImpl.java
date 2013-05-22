package com.xizhao.design.event;

/**
 * <p>
 * <p> Date: 13-5-22 Time: 下午6:56 </p>
 *
 * @author xizhao.xsz
 */
public class MyCreateEventImpl implements MyEvent {
    private String type="";
    public   MyCreateEventImpl(){
        this.type=MyEvent.createEvent;
    }
    @Override
    public String getEvent() {
        return this.type;
    }
}
