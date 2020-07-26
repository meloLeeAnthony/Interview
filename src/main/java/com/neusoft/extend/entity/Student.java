package com.neusoft.extend.entity;

public class Student extends Person {

    /**
     * 第二步执行：子类【静态成员】和【静态代码块】，按在代码中出现的顺序依次执行；
     */
    public static int k = print();

    public static int m = new Person().plus(k);

    public Student() {
        System.out.println("Student 构造函数");
    }

    public static int print() {
        System.out.println("Student print");
        return 321;
    }
}
