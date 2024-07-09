package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighSal {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        // Find the employee with the highest salary
        Employee highestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new); // This will throw NoSuchElementException if the list is empty

        // Print the name of the highest paid employee
        System.out.println("Highest Paid Employee: " + highestPaidEmployee.getName());
               
    }
}