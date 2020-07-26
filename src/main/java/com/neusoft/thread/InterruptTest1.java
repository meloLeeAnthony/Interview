package com.neusoft.thread;

import java.util.concurrent.TimeUnit;

/**
 * isInterrupted、interrupt方法
 *
 * @company 咕泡学院
 */
public class InterruptTest1 implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("当前子线程是： " + Thread.currentThread().getName());

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                /*
                 * 抛出异常后，会对interrupt属性做复位处理（2：interrupt：true -> false）
                 * 复位处理的目的：告诉调用者已经响应了调用操作，但线程是否终止取决于实际情况
                 */
                e.printStackTrace();

                /*
                 * 该位置处理逻辑取决于实际场景
                 */
                // Thread.currentThread().interrupt(); // 可以在该位置继续设置interrupt为继续中断标志（3：interrupt：false -> true）
            }
        }


    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new InterruptTest1());
        thread.start();

        TimeUnit.SECONDS.sleep(2);

        // 中断，本质上类似于stop标志位设置为true（1：interrupt：true -> false）
        thread.interrupt();

        boolean interrupted = Thread.interrupted(); // 会对interrupt属性做复位操作（4：interrupt：true -> false）
        System.out.println(interrupted);
    }
}
