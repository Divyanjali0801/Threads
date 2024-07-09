package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;
import java.util.stream.Collectors;


public class AvgAge {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        
        double averageAge = employees.stream()
                                    .mapToInt(Employee::getAge)
                                    .average()
                                    .orElse(0);
                             

        System.out.println("Average Age: " + averageAge);
    }
}
