package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;

/**
 *
 * @author hp
 */
public class GenderCountWithoutStreams {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();
        
        int maleCount=0,femaleCount=0;
        
        for(Employee emp : employees){
        if(emp.getGender().equalsIgnoreCase("male")){
        maleCount=maleCount+1;
        }if(emp.getGender().equalsIgnoreCase("female")){
        femaleCount=femaleCount+1;
        }
        
        }
        System.out.println("males:"+maleCount);
        System.out.println("females:"+femaleCount);
    }
    
}
