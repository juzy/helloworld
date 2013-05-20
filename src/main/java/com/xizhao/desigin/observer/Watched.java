package com.xizhao.desigin.observer;

import java.util.Observable;

/**
 * <p>
 * <p> Date: 13-5-20 Time: 下午5:24 </p>
 *
 * @author xizhao.xsz
 */
public class Watched extends Observable {
    private String data="";
    public String getData(){
        return data;
    }
    public void setData(String data){
        if(!this.data.equalsIgnoreCase(data)){
            this.data=data;
            setChanged();
        }
        notifyObservers();
    }
}
