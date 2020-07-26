package com.neusoft.jdk8.lambda;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * 消费型接口；对类型为T的对象做操作；入参为T，没有出参
 */
public class T06_ConsumerTest {

    @Test
    public void test() {
        this.consumerTest(16078.24, (salary) -> System.out.println("发工资" + salary + ", 很开心"));
    }

    public void consumerTest(double salary, Consumer<Double> happyMethod) {
        happyMethod.accept(salary);
    }
}
