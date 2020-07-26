package com.neusoft.jdk8.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 调用Collections.sort()方法，通过定制排序比较两个Employee（先按年龄比，年龄相同按姓名比），使用Lambda表达式作为参数传递
 */
public class T05_LambdaTest {

    List<Employee> employeeList = Arrays.asList(new Employee("张2", 42, 3000.0),
            new Employee("张1", 42, 6000.0));

    @Test
    public void test() {
        Collections.sort(employeeList, (emp1, emp2) -> {
            int rtnFlag = -1;

            if (emp1.getEmployeeAge() > emp2.getEmployeeAge()) {
                rtnFlag = 1;
            } else if (emp1.getEmployeeAge() == emp2.getEmployeeAge()) {
                rtnFlag = emp1.getEmployeeName().compareTo(emp2.getEmployeeName());
            }

            return rtnFlag;
        });

        employeeList.forEach(System.out::println);
    }
}