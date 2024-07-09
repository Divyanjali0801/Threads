package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;
import java.util.ArrayList;

public class AllDeptsWithoutStreams {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

       
        List<String> departments = new ArrayList<>();

        
        for (Employee employee : employees) {
            String department = employee.getDepartment();
            if (!departments.contains(department)) {
                departments.add(department);
            }
        }

        System.out.println("Departments:");
        for (String department : departments) {
            System.out.println(department);
        }
    }
}
