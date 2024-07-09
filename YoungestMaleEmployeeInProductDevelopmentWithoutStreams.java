/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;

/**
 *
 * @author hp
 */
public class YoungestMaleEmployeeInProductDevelopmentWithoutStreams {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        int YoungAge = 99;
        String emp1 = null;
        for (Employee emp : employees) {
            if (emp.getGender().equalsIgnoreCase("male") && emp.getDepartment().equalsIgnoreCase("Product Development")) {
                if (emp.getAge() < YoungAge) {
                    YoungAge = emp.getAge();
                    emp1 = emp.getName();
                }

            }

        }
        System.out.println("name:" + emp1);

    }

}
