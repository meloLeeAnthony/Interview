package com.neusoft.thread.test.t00;

/**
 * @author lichu
 */
public class PrintClassDemo {

    private static volatile boolean flag = true;

    private static volatile int counter = 52;

    private static int initNumber = 1;

    private static char initCharacter = 'A';

    public synchronized void printLetters() throws InterruptedException {
        while (true) {
            if (!flag) {
                wait();
            }

            if (counter >= 1) {
                System.out.print(initCharacter);
                initCharacter += 1;
                flag = false;
                counter --;

                notifyAll();
            }


        }
    }

    public synchronized void printNumbers() throws InterruptedException {
        while (true) {
            if (flag) {
                wait();
            }

            if (counter >= 1) {
                System.out.print(initNumber);
                initNumber += 1;
                flag = true;
                counter --;

                notifyAll();
            }
        }
    }



}
