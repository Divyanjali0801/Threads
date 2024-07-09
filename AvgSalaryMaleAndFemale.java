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
public class AvgSalaryMaleAndFemale {
    public static void main(String[] args) {
                List<Employee> employees = EmployeeData.getEmployeeList();

                
                Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
				employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
				         
				System.out.println(avgSalaryOfMaleAndFemaleEmployees);
    }
}
