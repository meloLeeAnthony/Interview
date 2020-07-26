package com.neusoft.jdk8.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T02_EmployeeTest {

    List<Employee> employeeList = Arrays.asList(new Employee("张三", 18, 3000.24),
            new Employee("李四", 28, 8009.46),
            new Employee("王五", 33, 13412.42));

    /**
     * 第一种实现方式：多个方法做不同业务逻辑实现
     * 缺点：需要多个方法支撑
     */
    @Test
    public void test1() {
        List<Employee> filerEmployeeList = filerAgeEmployees(employeeList);

        for (Employee employee : filerEmployeeList) {
            System.out.println(employee);
        }
    }

    /**
     * 方法一：获取年龄大于30的雇员列表
     * 缺点：需要多个方法支撑
     *
     * @param employeeList
     * @return
     */
    public List<Employee> filerAgeEmployees(List<Employee> employeeList) {
        List<Employee> filerEmployeeList = new ArrayList<>();

        for (Employee employee : employeeList) {
            if (employee.getEmployeeAge() >= 30) {
                filerEmployeeList.add(employee);
            }
        }

        return filerEmployeeList;
    }

    /**
     * 方法二：获取工资大于5000的雇员列表
     * 缺点：需要多个方法支撑
     *
     * @param employeeList
     * @return
     */
    public List<Employee> filerSalaryEmployees(List<Employee> employeeList) {
        List<Employee> filerEmployeeList = new ArrayList<>();

        for (Employee employee : employeeList) {
            if (employee.getEmployeeSalary() >= 5000) {
                filerEmployeeList.add(employee);
            }
        }

        return filerEmployeeList;
    }

    /**
     * 第二种实现方式：策略设计模式优化
     * 优点：只需要一个方法实现
     * 缺点：需要多个接口实现类支撑
     */
    @Test
    public void test2() {
        // List<Employee> filerEmployeeList = filter(employeeList, new AgePredicate());
        List<Employee> filerEmployeeList = filter(employeeList, new SalaryPredicate());

        for (Employee employee : filerEmployeeList) {
            System.out.println(employee);
        }
    }

    /**
     * 第二种实现方式：策略设计模式优化
     * 优点：只需要一个方法实现
     * 缺点：需要多个接口实现类支撑
     *
     * @param employeeList
     * @param predicate
     * @return
     */
    public List<Employee> filter(List<Employee> employeeList, EmployeePredicate<Employee> predicate) {
        List<Employee> filerEmployeeList = new ArrayList<>();

        for (Employee employee : employeeList) {
            if (predicate.filter(employee)) {
                filerEmployeeList.add(employee);
            }
        }

        return filerEmployeeList;
    }

    /**
     * 第三种实现方式：Lambda表达式取代匿名内部类
     * 优点：不再需要多实现子类
     */
    @Test
    public void test3() {
        List<Employee> filerEmployeeList = null;
        // List<Employee> filerEmployeeList = filter(employeeList, new AgePredicate());
        filerEmployeeList = filter(employeeList, employee -> employee.getEmployeeAge() > 30);

        // List<Employee> filerEmployeeList = filter(employeeList, new SalaryPredicate());
        filerEmployeeList = filter(employeeList, employee -> employee.getEmployeeSalary() > 5000);

        filerEmployeeList.forEach(System.out::println);
    }

    /**
     * 第四种实现方式：Lambda表达式+stream api流式编程
     * 优点：不再需要多实现子类
     */
    @Test
    public void test4() {
        employeeList.stream()
                .filter(employee -> employee.getEmployeeSalary() > 5000)
                .limit(1) // 限制返回条数
                .forEach(System.out::println);
    }
}

/**
 * 雇员实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee {

    /*
     * 雇员姓名
     */
    private String employeeName;

    /*
     * 雇员年龄
     */
    private int employeeAge;

    /*
     * 雇员工资
     */
    private double employeeSalary;

}
