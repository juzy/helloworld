package com.xizhao.currency.countdownlatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.MICROSECONDS;

/**
 * User: xizhao.xsz
 * Time:2014-11-17 11:44
 * thinking in java p723ДњТы
 */
public class TaskPortion implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private static Random rand = new Random(47);
    private final CountDownLatch countDownLatch;

    public TaskPortion(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            doWork();
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            //TODO:acceptable way to exit ????
        }

    }

    public void doWork() throws InterruptedException {

        MICROSECONDS.sleep(rand.nextInt(2000));
        System.out.println(this + " TaskPortion completed");

    }

    public String toString() {
        return String.format("%1$-3d", id);
    }
}
