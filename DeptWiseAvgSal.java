
package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author hp
 */
public class DeptWiseAvgSal {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();
        
         Map<String, Double> averageSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, 
                        Collectors.averagingDouble(Employee::getSalary)));

        averageSalaryByDepartment.forEach((department, avgSalary) ->
                System.out.println(department + ": " + avgSalary));
    }
    
}
