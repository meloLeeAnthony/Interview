package com.neusoft.DesignMode.Flyweight;

public class IntegerTest1 {

    public static void main(String[] args) {
        Integer value1 = 99;    // -128 ~ 127之间
        Integer value2 = new Integer(99);
        Integer value3 = Integer.valueOf(99);   // -128 ~ 127之间的数有IntegerCache缓存机制

        /*
         * equals是值的比较
         *  下面两个都是true
         */
        System.out.println("value1 equals value2: " + value1.equals(value2));
        System.out.println("value1 equals value3: " + value1.equals(value3));

        /*
         * ==是对象地址的比较
         *  第一个是false，new出来的是一个新对象
         *  第二个是true，因为-128 ~ 127之间的数字有IntegerCache缓存机制（Flyweight享元设计模式）
         */
        System.out.println("value1 == value2: " + (value1 == value2));
        System.out.println("value1 == value3: " + (value1 == value3));

        /*
         * IntegerCache可以通过修改java.lang.Integer.IntegerCache.high参数调整缓存最大值上限
         */
    }
}
