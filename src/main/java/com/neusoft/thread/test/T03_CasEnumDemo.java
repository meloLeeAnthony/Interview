package com.neusoft.thread.test;

/**
 * 通过自旋锁概念+Enum枚举实现
 */
public class T03_CasEnumDemo {

    enum Signal {numberThread,letterThread}

    static Thread numberThread = null, letterThread = null;

    static Signal readyToRunThread = Signal.numberThread;

    public static void main(String[] args) {
        char[] numbers = "1234567".toCharArray();
        char[] letters = "ABCDEFG".toCharArray();

        numberThread = new Thread(() -> {
            for (char number : numbers) {
                while(readyToRunThread != Signal.numberThread) { }

                System.out.print(number);

                readyToRunThread = Signal.letterThread;
            }
        }, "numberThread");

        letterThread = new Thread(() -> {
            for (char letter : letters) {
                while(readyToRunThread != Signal.letterThread) { }

                System.out.print(letter);

                readyToRunThread = Signal.numberThread;
            }
        }, "letterThread");

        numberThread.start();
        letterThread.start();
    }

}
