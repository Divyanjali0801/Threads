package com.codebrains.stream.interview;

import com.codebrains.employee.Employee;
import com.codebrains.employee.EmployeeData;
import java.util.List;

 
public class MaleAndFemaleInSalesWithoutStreams {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployeeList();

        Employee e = employees.get(0);
        int count=0;
        int Male=0,female=0;

        for (Employee emp : employees) {
            if (emp.getDepartment().equals("Sales And Marketing")) {
                count+=1;
            }
            if(emp.getDepartment().equals("Sales And Marketing") && emp.getGender().equalsIgnoreCase("male")){
            Male=Male+1;
             }if(emp.getDepartment().equals("Sales And Marketing") && emp.getGender().equalsIgnoreCase("female")){
            female=female+1;
        }
        }      
       
        System.out.println("Total No Of Males And Females In Sales And Mraketing is " +count);
        System.out.println("Total No Of Males In Sales And Mraketing is " +Male);
        System.out.println("Total No Of Females In Sales And Mraketing is " +female);
        
    }
}

