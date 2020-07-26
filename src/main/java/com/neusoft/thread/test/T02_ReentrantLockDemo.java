package com.neusoft.thread.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 通过ReentrantLock和Condition实现
 */
public class T02_ReentrantLockDemo {

    static Thread numberThread = null, letterThread = null;

    public static void main(String[] args) {
        char[] numbers = "1234567".toCharArray();
        char[] letters = "ABCDEFG".toCharArray();

        Lock lock = new ReentrantLock();
        Condition numberCondition = lock.newCondition();
        Condition letterCondition = lock.newCondition();

        numberThread = new Thread(() -> {
            try {
                lock.lock();
                for (char number : numbers) {
                    System.out.print(number);
                    numberCondition.await();
                    letterCondition.signal();
                }
                numberCondition.signal();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "numberThread");

        letterThread = new Thread(() -> {
            try {
                lock.lock();

                for (char letter : letters) {
                    System.out.print(letter);
                    numberCondition.signal();
                    letterCondition.await();
                }
                letterCondition.signal();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "numberThread");

        numberThread.start();
        letterThread.start();
    }
}
