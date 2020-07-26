package com.neusoft.entity;

import lombok.Data;

/**
 * @Data 会为类的所有属性自动生成setter/getter、equals、canEqual、hashCode、toString方法，如为final属性，则不会为该属性生成setter方法
 */
@Data
public class Student extends Person {
    private String name;

    private String sex;

    private Integer age;

    public Student() {

    }

    public Student(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


}
