package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;
import java.util.ArrayList;

public class DeptWiseAvgSalWithoutStreams {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        List<String> departments = new ArrayList<>();
        List<Double> totalSalaries = new ArrayList<>();
        List<Integer> employeeCounts = new ArrayList<>();

        for (Employee employee : employees) {
            String department = employee.getDepartment();
            double salary = employee.getSalary();

            if (!departments.contains(department)) {
                departments.add(department);
                totalSalaries.add(salary);
                employeeCounts.add(1);
            } else {
                int index = departments.indexOf(department);
                totalSalaries.set(index, totalSalaries.get(index) + salary);
                employeeCounts.set(index, employeeCounts.get(index) + 1);
            }
        }

        System.out.println("Average Salary by Department:");
        for (int i = 0; i < departments.size(); i++) {
            String department = departments.get(i);
            double averageSalary = totalSalaries.get(i) / employeeCounts.get(i);
            System.out.println(department + ": " + averageSalary);
        }
    }
}
