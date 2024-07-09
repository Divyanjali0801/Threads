/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Counts the number of male and female employees in the Sales and Marketing department.
 */
public class MaleAndFemaleInSales {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        
        Map<String, Long> countMaleFemaleEmployeesInSalesMarketing=
				employees.stream()
				            .filter(e -> e.getDepartment()=="Sales And Marketing")
				            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				 
				System.out.println(countMaleFemaleEmployeesInSalesMarketing);
    }
}
