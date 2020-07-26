package com.neusoft.DesignMode.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void hungryModeTest() {
        Singleton1 test1 = Singleton1.getInstance();
        Singleton1 test2 = Singleton1.getInstance();

        Assert.assertEquals(test1, test2);
    }

    @Test
    public void lazyModeTest() {
        Singleton2 test1 = Singleton2.getInstance();
        Singleton2 test2 = Singleton2.getInstance();

        Assert.assertEquals(test1, test2);
    }

    @Test
    public void staticInnerClassModeTest() {
        Singleton3 test1 = Singleton3.getInstance();
        Singleton3 test2 = Singleton3.getInstance();

        Assert.assertEquals(test1, test2);
    }
}
