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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class A18CollectMap {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        Map<String, String> gMap = new HashMap<>();
        Map<String, List<Employee>> deptMap = new HashMap<>();
       
        // Collect eMails and depts to a map
        gMap = eList.stream()
            .collect(Collectors.toMap(Employee::getEmail, 
                e -> e.getDept()));        

        System.out.println("\n== Emails and depts ==");
        gMap.forEach((k,v) -> {
            System.out.println("Email: " + k + " DeptName: " + v); 
            ;
        });
        
    }
    
}
