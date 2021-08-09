/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.EmployeeSearch10;

/**
 *
 * @author Jaco
 */

import java.util.List;
import java.util.stream.Collectors;


public class A12CollectMath {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
       
        // Collect CO Executives
        double avgSalary = eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            .collect(
                Collectors.averagingDouble(Employee::getSalary));        

        System.out.println("\n== CO Exec Avg Salary ==");
        System.out.printf("Average: $%,9.2f %n", avgSalary);        
                
    }
    
}
