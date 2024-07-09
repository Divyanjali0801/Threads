/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author hp
 */
public class JoiningAfter2015 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

       
        List<String> namesOfEmployeesJoinedAfter2015 = employees.stream()
                                                                .filter(employee -> employee.getYearOfJoining() > 2015)
                                                                .map(Employee::getName)
                                                                .collect(Collectors.toList());

       
        namesOfEmployeesJoinedAfter2015.forEach(System.out::println);
    }
}