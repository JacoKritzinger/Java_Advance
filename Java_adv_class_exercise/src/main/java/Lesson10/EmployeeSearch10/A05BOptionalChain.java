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
import java.util.Optional;


public class A05BOptionalChain {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        System.out.println("\n== First CO Bonus ==");
        
        System.out.println(
          eList.stream()
              .filter(e -> e.getRole().equals(Role.EXECUTIVE))
              .filter(e -> e.getState().equals("AZ"))
              .findFirst()
              .flatMap(e -> Optional.of(e.getSummary()))
              .orElse("No match found!")
        );                                    
    }
}
