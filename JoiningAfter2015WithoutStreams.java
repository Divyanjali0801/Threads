/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codebrains.stream.interview;

/**
 *
 * @author hp
 */
import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class JoiningAfter2015WithoutStreams {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();
        
        List<Employee> EmployeeJoin2015=new ArrayList();
        for(Employee emp:employees){
        if(emp.getYearOfJoining() >=2015){
            EmployeeJoin2015.add(emp);
        }
        
        }
        for(Employee emp: EmployeeJoin2015)
        System.out.println("name: "+emp.getName()+" & year of joining: "+emp.getYearOfJoining());
    }
    
}
