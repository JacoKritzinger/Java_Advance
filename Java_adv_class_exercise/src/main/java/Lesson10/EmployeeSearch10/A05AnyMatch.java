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


public class A05AnyMatch {
    
    public static void main(String[] args) {
        
      List<Employee> eList = Employee.createShortList();
        
      System.out.println("\n== First CO Bonus ==");

      if (eList.stream().anyMatch(
          e -> e.getState().equals("CO"))){
            
        Optional<Employee> result = eList.stream()
          .peek(e -> System.out.println("Stream"))
          .filter(e -> e.getRole().equals(Role.EXECUTIVE))
          .filter(e -> e.getState().equals("CO"))
          .findFirst();

        if (result.isPresent()){result.get().printSummary();}
      }
                
    }
    
}
