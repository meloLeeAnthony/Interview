package com.neusoft.basic;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * 该面试题包含以下3个知识点：
 * 一、Integer传递为值传递
 * 二、setAccessible：跳过安全检查security manager，使private修饰符的字段也可以反射访问，也可以相应提高性能
 * 三、Integer和int之间的自动装箱、拆箱时valueOf()方法的IntegerCache缓存问题：Cache to support the object identity semantics of autoboxing for values between -128 and 127 (inclusive) as required by JLS.
 *
 * @company 咕泡学院
 */
public class SwapDemo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IOException {
        Integer i1 = 1, i2 = 2;
        System.out.println("i1:" + i1 + "; i2:" + i2);

        swap(i1, i2);
        System.out.println("i1:" + i1 + "; i2:" + i2);
    }

    /**
     * 交换i1、i2的值
     *  Integer temp = i1; 值在-128 and 127之间，会从IntegerCache数组中取值，直接取i1，不会重新生成Integer对象
     *
     * @param i1
     * @param i2
     */
    private static void swap(Integer i1, Integer i2) throws NoSuchFieldException, IllegalAccessException {
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);

        Integer temp = new Integer(i1.intValue());
        // Integer temp = i1;

        field.set(i1, i2.intValue()); // Integer.valueOf(i2.intValue()).intValue()
        field.set(i2, temp); // Integer.valueOf(temp).intValue()
    }
}

