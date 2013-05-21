package com.xizhao.desigin.observer.asyn;

/**
 * <p>
 * <p> Date: 13-5-21 Time: 上午9:56 </p>
 *
 * @author xizhao.xsz
 */
public interface Observerd {
    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    public void update();
}
