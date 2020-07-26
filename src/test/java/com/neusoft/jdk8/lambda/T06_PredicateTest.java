package com.neusoft.jdk8.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 断定型接口；确定类型为T的对象是否满足某约束，并返回boolean值；入参为T，出参为boolean
 */
public class T06_PredicateTest {

    List<Employee> employeeList = Arrays.asList(new Employee("张三", 18, 3000.24),
            new Employee("李四", 28, 8009.46),
            new Employee("王五", 33, 13412.42));

    @Test
    public void test() {
        List<Employee> rtnList = this.dealList(employeeList, e -> e.getEmployeeSalary() > 5000);
        rtnList.forEach(System.out::println);
    }

    public List<Employee> dealList(List<Employee> employeeList, Predicate<Employee> preHandler) {
        List<Employee> rtnList = new ArrayList<>();

        for (Employee employee : employeeList) {
            if (preHandler.test(employee))
                rtnList.add(employee);
        }

        return rtnList;
    }
}
