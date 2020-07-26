package com.neusoft.thread.test.t00;

/**
 * 交替打印字母和数字
 */
public class Test1 {

    public static void main(String[] args) {
        PrintClassDemo printClassDemo = new PrintClassDemo();

        new Thread(new PrintLetterThread(printClassDemo), "Thread-Letter").start();
        new Thread(new PrintNumberThread(printClassDemo), "Thread-Number").start();
    }
}
