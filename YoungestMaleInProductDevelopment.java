package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class YoungestMaleInProductDevelopment {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        Optional<Employee> emp = employees.stream()
                .filter(e -> "Male".equals(e.getGender()) && e.getDepartment().equalsIgnoreCase("Product Development"))
                .min(Comparator.comparingInt(Employee::getAge));

        if (emp.isPresent()) {
            Employee e = emp.get();
            System.out.println("ID : " + e.getId());
            System.out.println("Name : " + e.getName());
        } else {
            System.out.println("No male employee found in Product Development department.");
        }
    }
}
