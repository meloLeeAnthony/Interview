package com.neusoft.transmit;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 值传递 or 引用传递
 *
 * @company 富仁集团
 */
public class Test1 {

    private String str = new String("abcdefg");

    private char[] ch = {'1', '2', '3'};

    public static void main(String[] args) {
        Test1 test = new Test1();

        test.change(test.str, test.ch);

        System.out.println(test.str + " and " + ArrayUtils.toString(test.ch));
    }

    private void change(String str, char[] ch) {
        str = "uvwxyz";
        ch[0] = '9';
    }
}
