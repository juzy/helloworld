package com.xizhao.design.observer.asyn;

import java.util.Iterator;
import java.util.Vector;

/**
 * <p>
 * <p> Date: 13-5-21 Time: 上午10:09 </p>
 *
 * @author xizhao.xsz
 */
public class ObservedObject implements Observerd {
    private Vector<Invoker> observerList = new Vector<Invoker>();

    @Override
    public void addObserver(final Observer o) {
        observerList.add(new Invoker(o));
    }

    @Override
    public void removeObserver(final Observer o) {
        Iterator<Invoker> it = observerList.iterator();
        while (it.hasNext()) {
            Invoker i = it.next();
            if (i.testSameObserver(o)) {
                observerList.remove(i);
                break;
            }
        }
    }

    @Override
    public void update() {
        for (Invoker i : observerList) {
            i.invoke();
        }
    }
}
