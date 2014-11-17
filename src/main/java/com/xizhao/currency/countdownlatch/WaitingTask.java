package com.xizhao.currency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * User: xizhao.xsz
 * Time:2014-11-17 13:30
 */
public class WaitingTask implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final CountDownLatch latch;

    public WaitingTask(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
            System.out.println("Latch barrier passed for " + this);
        } catch (InterruptedException e) {
            System.out.println(this + "completed");
        }

    }

    public String toString() {
        return String.format("%1$-3d", id);
    }

}
