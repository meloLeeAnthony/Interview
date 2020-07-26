package com.neusoft.thread.test;

import java.util.concurrent.locks.LockSupport;

/**
 * LockSupport类的park、unpark方法
 * @author lichu
 */
public class T01_LockSupportDemo {

    static Thread numberThread = null, letterThread = null;

    public static void main(String[] args) {
        char[] numbers = "1234567".toCharArray();
        char[] letters = "ABCDEFG".toCharArray();

        numberThread = new Thread(() -> {
            for (char number : numbers) {
                System.out.print(number);
                LockSupport.unpark(letterThread); // 唤醒letterThread
                LockSupport.park(); // 阻塞numberThread
            }
        }, "numberThread");

        letterThread = new Thread(() -> {
            for (char letter : letters) {
                LockSupport.park(); // 阻塞letterThread
                System.out.print(letter);
                LockSupport.unpark(numberThread); // 唤醒numberThread
            }
        }, "letterThread");

        numberThread.start();
        letterThread.start();
    }
}
