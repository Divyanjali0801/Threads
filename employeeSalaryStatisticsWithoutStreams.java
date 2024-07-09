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

/**
 *
 * @author hp
 */
public class employeeSalaryStatisticsWithoutStreams {
    public static void main(String[] args) {
                List<Employee> employees = EmployeeData.getEmployeeList();
                
                int totalSal=0,count=0;
                for(Employee emp:employees){
                    totalSal+=emp.getSalary();
                    count+=1;
                 }
                System.out.println("total sal: "+totalSal);
              System.out.println("avg sal: "+(totalSal/count));

    }
    
}
