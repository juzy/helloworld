package com.xizhao.currency;

/**
 * User: xizhao.xsz
 * Time:2014-05-29 09:58
 */
public enum EnumCurrency implements Runnable {
    PENNY(1){
        @Override
        public String color() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }
    } ;

    private int value;
    private EnumCurrency(int value){
        this.value=value;
    }
    @Override
    public void run() {
        //To change body of implemented methods use File | Settings | File Templates.
    }


    public abstract String color();
}
