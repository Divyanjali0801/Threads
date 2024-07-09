package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.ArrayList;
import java.util.List;

public class EmployeeNamesByDepartmentWithoutStreams {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        List<String> departments = new ArrayList<>();

        for (Employee emp : employees) {
            if (!departments.contains(emp.getDepartment())) {
                departments.add(emp.getDepartment());
            }
        }

        for (String department : departments) {
            System.out.println("Department: " + department);

            List<String> employeeNames = new ArrayList<>();

            for (Employee emp : employees) {
                if (emp.getDepartment().equals(department)) {
                    employeeNames.add(emp.getName());
                }
            }

            for (String name : employeeNames) {
                System.out.println(name);
            }
            System.out.println();
        }
    }
}
