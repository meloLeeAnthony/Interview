package com.neusoft.thread.test.t00;

public class PrintLetterThread implements Runnable {

    private PrintClassDemo demo;

    public PrintLetterThread(PrintClassDemo demo) {
        this.demo = demo;
    }

    @Override
    public void run() {
        try {
            demo.printLetters();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

