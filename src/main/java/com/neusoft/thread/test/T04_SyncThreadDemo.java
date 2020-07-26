package com.neusoft.thread.test;

import java.util.concurrent.CountDownLatch;

/**
 * 通过synchronized和常规线程的wait、notify方法实现
 */
public class T04_SyncThreadDemo {

    static Thread numberThread = null, letterThread = null;

    // 控制数字、子母线程的执行先后顺序
    private static CountDownLatch latch = new CountDownLatch(1);

    public static void main(String[] args) {
        final Object obj = new Object();

        char[] numbers = "1234567".toCharArray();
        char[] letters = "ABCDEFG".toCharArray();

        numberThread = new Thread(() -> {
            synchronized (obj) {
                for (char number : numbers) {
                    System.out.print(number);

                    try {
                        obj.notify();
                        latch.countDown();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                obj.notify();
            }
        }, "numberThread");

        letterThread = new Thread(() -> {
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj) {
                for (char letter : letters) {
                    System.out.print(letter);

                    try {
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                obj.notify();
            }

        }, "numberThread");

        letterThread.start();
        numberThread.start();
    }
}
