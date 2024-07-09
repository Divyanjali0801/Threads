package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeNamesByDepartmentWithStreams {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        Map<String, List<String>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, 
                        Collectors.mapping(Employee::getName, Collectors.toList())));

        employeesByDepartment.forEach((department, name) -> {
            System.out.println("Department: " + department);
            name.forEach(System.out::println);
            System.out.println();  
        }
      );
    }
}
