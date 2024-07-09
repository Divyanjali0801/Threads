package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;

public class AvgAgeWithoutStreams {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();
        
        float avgAge = 0;
        int count = 0;
        
        for (Employee employee : employees) {
            avgAge += employee.getAge(); // Accumulate the total age
            count++; // Increment the count
        }
        
        
         avgAge = (avgAge / count);
        System.out.println("Average Age: " + avgAge); 
    }
}
