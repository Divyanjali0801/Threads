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
public class MostWorkingExperienceWithoutStreams {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();
        int Year=2024;
        Employee emp1=null;
        
        for (Employee emp : employees) {
            if(emp.getYearOfJoining()<Year){
            Year=emp.getYearOfJoining();
            emp1=emp;
            
            }
            }
        System.out.println("name of employee with most working "+emp1.getName());
    }
}
