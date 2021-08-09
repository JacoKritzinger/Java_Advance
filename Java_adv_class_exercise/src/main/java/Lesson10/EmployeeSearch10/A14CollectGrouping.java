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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class A14CollectGrouping {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        Map<String, List<Employee>> gMap = new HashMap<>();
       
        // Collect CO Executives
        gMap = eList.stream()
            .collect(Collectors.groupingBy(Employee::getDept));        

        System.out.println("\n== Employees by Dept ==");
        gMap.forEach((k,v) -> {
            System.out.println("\nDept: " + k); 
            v.forEach(Employee::printSummary);
        });
                
    }
    
}
