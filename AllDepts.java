package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;
import java.util.stream.Collectors;

public class AllDepts {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        // Extracting departments using streams
        List<String> departments = employees.stream()
                                            .map(Employee::getDepartment)
                                            .distinct()
                                            .collect(Collectors.toList());

        // Print all the departments
        System.out.println("Departments:");
        departments.forEach(System.out::println);
    }
}
