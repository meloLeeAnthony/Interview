package com.neusoft.jdk8.lambda;

public interface EmployeePredicate<T> {

    public boolean filter(T t);
}

/**
 * 获取年龄大于30的雇员列表
 */
class AgePredicate implements EmployeePredicate<Employee> {

    @Override
    public boolean filter(Employee employee) {
        return employee.getEmployeeAge() > 30;
    }
}

/**
 * 获取工资大于5000的雇员列表
 */
class SalaryPredicate implements EmployeePredicate<Employee> {

    @Override
    public boolean filter(Employee employee) {
        return employee.getEmployeeSalary() > 5000;
    }
}

