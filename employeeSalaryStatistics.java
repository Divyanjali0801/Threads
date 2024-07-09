package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;

import java.util.List;

public class employeeSalaryStatistics {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        double totalSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();

        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0); 
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + averageSalary);
    }
}
