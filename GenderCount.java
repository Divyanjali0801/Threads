package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenderCount {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        Map<String, Long> noOfMaleAndFemaleEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);
    }
}
