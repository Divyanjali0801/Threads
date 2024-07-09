package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class MostWorkingExperience {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        Optional<Employee> e = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfJoining))
                .findFirst();

        if (e.isPresent()) {
            Employee mostExperiencedEmployee = e.get();
            System.out.println("Employee with most experience: " + mostExperiencedEmployee.getName());
        } else {
            System.out.println("No employees found.");
        }
    }
}
