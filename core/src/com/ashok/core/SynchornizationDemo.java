package com.ashok.core;

public class SynchornizationDemo {

    public static void main(String[] args) {
        Thread a = new Thread(new Walker(), "a");
        Thread b = new Thread(new Walker(), "b");
        Thread c = new Thread(new Walker(), "c");

        a.start();
        b.start();
        c.start();
    }

}


class Walker implements Runnable {

    public void run()  {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "Walking step : " + i);
        }
    }

}
