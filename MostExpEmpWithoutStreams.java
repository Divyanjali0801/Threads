package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;

 
public class MostExpEmpWithoutStreams {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        Employee seniorEmployee = employees.get(0);
        int experience = 2024;

        for (Employee e : employees) {
            if (e.getYearOfJoining() < experience) {
                experience = e.getYearOfJoining();
                seniorEmployee = e;
            }
        }

       
        System.out.println("ID: " + seniorEmployee.getId());
        System.out.println("Name: " + seniorEmployee.getName());
    }
}
