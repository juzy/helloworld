package com.xizhao.currency.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * User: xizhao.xsz
 * Time:2014-11-17 14:22
 */
public class CountDownLatchDemo {
    static final int SIZE=10;
    public static void main(String[] args)throws Exception{
       ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch latch=new CountDownLatch(SIZE);
        for(int i=0;i<10;i++){
            executorService.execute(new WaitingTask(latch));
        }
        for(int i=0;i<10;i++){
            executorService.execute(new TaskPortion(latch));
        }
        System.out.println("Lauched all tasks");
    }
}
