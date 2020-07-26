package com.neusoft.thread.test.t00;

public class PrintNumberThread implements Runnable {

    private PrintClassDemo demo;

    public PrintNumberThread(PrintClassDemo demo) {
        this.demo = demo;
    }

    @Override
    public void run() {
        try {
            demo.printNumbers();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
