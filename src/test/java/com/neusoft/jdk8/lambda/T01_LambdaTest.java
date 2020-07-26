package com.neusoft.jdk8.lambda;


import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class T01_LambdaTest {

    /**
     * 匿名内部类实现大小比较
     */
    @Test
    public void test1() {
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer x, Integer y) {
                return Integer.compare(x, y);
            }
        };

        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }

    /**
     * Lambda表达式实现大小比较
     */
    @Test
    public void test2() {
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);

        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }
}
