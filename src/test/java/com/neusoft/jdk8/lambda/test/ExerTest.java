package com.neusoft.jdk8.lambda.test;

import org.junit.Test;

import java.math.BigDecimal;

public class ExerTest {

    @Test
    public void test() {
        long rtnLong = dealStr(123, 456, (l1, l2) -> Math.addExact(l1, l2));
        rtnLong = dealStr(2, 4, (l1, l2) -> Math.multiplyExact(l1, l2));

        System.out.println(rtnLong);
    }

    public long dealStr(long l1, long l2, MeloTest<Long, Long> fun) {
        return fun.operation(l1, l2);
    }

    ;
}

@FunctionalInterface
interface MeloTest<T, R> {

    public R operation(T t1, T t2);
}
