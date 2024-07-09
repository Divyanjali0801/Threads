/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.ArrayList;
import java.util.List;

public class AvgSalaryMaleAndFemaleWithoutStreams {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        double totalMaleSalary = 0;
        int maleCount = 0;
        double totalFemaleSalary = 0;
        int femaleCount = 0;

        for (Employee emp : employees) {
            if (emp.getGender().equalsIgnoreCase("male")) {
                totalMaleSalary += emp.getSalary();
                maleCount++;
            } else if (emp.getGender().equalsIgnoreCase("female")) {
                totalFemaleSalary += emp.getSalary();
                femaleCount++;
            }
        }

        double avgMaleSalary = totalMaleSalary / maleCount;

        double avgFemaleSalary = totalFemaleSalary / femaleCount;

        System.out.println("Average Salary for Males: " + avgMaleSalary);
        System.out.println("Average Salary for Females: " + avgFemaleSalary);
    }
}
