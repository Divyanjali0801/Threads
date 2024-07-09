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
public class HighSalWithoutStreams {
     public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();
    
        double highSal=0;
        for(Employee emp:employees){
            if(emp.getSalary()>highSal){
            highSal=emp.getSalary();
            }
        }
         System.out.println("highest sal:"+highSal);
}
}
