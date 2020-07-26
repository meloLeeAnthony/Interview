package com.neusoft.jdk8.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * 入参、出参个数情况分析
 */
public class T03_ParameterTest {

    /**
     * 第一种情况：
     * 入参：无入参
     * 出参：无出参
     */
    @Test
    public void test1() {
        Thread thread = new Thread(() -> System.out.println("Hello Lambda"));

        thread.start();
    }

    /**
     * 第二种情况：java.util.function.Consumer函数式接口
     * 入参：一个参数
     * 出参：无出参
     */
    @Test
    public void test2() {
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Hello Lambda");
    }

    /**
     * 第二种情况：java.util.function.Consumer函数式接口
     * 入参：多个参数
     * 出参：有出参
     */
    @Test
    public void test3() {
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);

        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }
}
