package com.neusoft.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class LockSupportUse {

    public static void main(String[] args) throws InterruptedException {
        testParkThenInterrupt();
    }

    private static void testParkThenInterrupt() throws InterruptedException {
        Thread thread = new Thread(new LockSupportThread(), "LockSupportThread");
        thread.start();

        TimeUnit.SECONDS.sleep(2);
        // 充分运行线程LockSupportThread两秒钟后，中断该线程，该线程能从park()方法返回
        thread.interrupt();
        // LockSupport.unpark(thread);
        System.out.println("Last ...");
    }

    static class LockSupportThread implements Runnable {
        @Override
        public void run() {
            LockSupport.park(); //阻塞自己
            System.out.println(Thread.currentThread().getName() + "从park()中返回");
        }
    }
}
