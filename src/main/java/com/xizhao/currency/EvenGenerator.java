package com.xizhao.currency;

/**
 * User: xizhao.xsz
 * Time:2014-06-06 10:22
 */
public class EvenGenerator {
     volatile  private  int i = 0;

    /*synchronized*/
     private   int next() {
        i++;
        i++;
//        System.out.println("i="+i);
        return i;
    }


    public static void main(String[] args) {
        EvenGenerator evenGenerator = new EvenGenerator();
        Thread thread1 = new Thread(new EvenChecker(evenGenerator));
        Thread thread2 = new Thread(new EvenChecker(evenGenerator));
        thread1.start();
        thread2.start();
    }

    static class EvenChecker implements Runnable {
        private EvenGenerator evenGenerator;

        public EvenChecker(EvenGenerator evenGenerator) {
            this.evenGenerator = evenGenerator;
        }


        @Override
        public void run() {
            while (true) {
                int value=evenGenerator.next();
                if (value % 2 != 0) {
                    System.out.println("value="+value);
                    System.exit(-101);
                }
            }
        }
    }
}
