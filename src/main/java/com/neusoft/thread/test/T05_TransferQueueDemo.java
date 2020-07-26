package com.neusoft.thread.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

/**
 *  通过TransferQueue的take阻塞方法实现
 */
public class T05_TransferQueueDemo {

    static Thread numberThread = null, letterThread = null;

    public static void main(String[] args) {
        TransferQueue<Character> queue = new LinkedTransferQueue<>();

        char[] numbers = "1234567".toCharArray();
        char[] letters = "ABCDEFG".toCharArray();

        numberThread = new Thread(() -> {
            try {
                for (char number : numbers) {
                    queue.transfer(number);

                    System.out.print(queue.take());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "numberThread");

        letterThread = new Thread(() -> {
            try {
                for (char letter : letters) {
                    System.out.print(queue.take());

                    queue.transfer(letter);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "numberThread");

        numberThread.start();
        letterThread.start();
    }
}
