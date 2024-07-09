/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author hp
 */
public class MostExperiencedEmp {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();
        
        Optional<Employee> e=employees.stream()
               .sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        
        Employee seniorEmployee=e.get();
        System.out.println("ID:"+seniorEmployee.getId());
        System.out.println("Name:"+seniorEmployee.getName());
    }
    
}
