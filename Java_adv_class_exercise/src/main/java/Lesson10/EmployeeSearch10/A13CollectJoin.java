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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class A13CollectJoin {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
       
        // Collect CO Executives
        String deptList = eList.stream()
            .map(Employee::getDept)
            .distinct()
            .collect(Collectors.joining(", "));        

        System.out.println("\n== Dept List ==");
        System.out.println("Total: " + deptList);        
                
    }
    
}
