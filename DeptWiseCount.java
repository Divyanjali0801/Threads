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
 *
 * @author hp
 */
public class DeptWiseCount {
    
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        // Count the number of employees in each department
        Map<String, Long> departmentWiseCount = employees.stream()
                                                         .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        // Print the department-wise count of employees
        departmentWiseCount.forEach((department, count) -> 
            System.out.println(department + ": " + count));
    }
    
}
