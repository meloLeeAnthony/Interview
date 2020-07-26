package com.neusoft.thread;

/**
 * 如果一个变量加了volatile关键字，就会告诉JVM编译器和JMM（Java Memory Model）内存模型：
 *      这个变量是对所有线程共享、可见的，每次jvm都会读取最新写入的值并使其最新值在所有CPU可见
 *
 * <p>
 * 示例目的：volatile只能保证可见性，不能保证原子性
 *
 * @company 富仁集团
 */
public class VolatileTest1 {

    public volatile int i = 0;

    public void increase() {
        i++;
    }

    public static void main(String[] args) {
        final VolatileTest1 test = new VolatileTest1();

        for (int j = 0; j < 10; j++) {
            // lambda表达式
            new Thread(() -> {
                for (int k = 0; k < 1000; k++) {
                    test.increase();
                }
            }).start();
        }

        /**
         * 所有子线程执行完以后还有2个线程在运行：
         *      main主线程、Monitor Ctrl-Break监控线程
         */
        while (Thread.activeCount() > 2) {
            Thread.yield(); // 当前main主线程暂停,将线程由运行状态转入就绪状态
        }

        System.out.println(test.i);
    }
}
