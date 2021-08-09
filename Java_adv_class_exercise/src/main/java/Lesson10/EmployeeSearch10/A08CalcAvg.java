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
import java.util.OptionalDouble;


public class A08CalcAvg {
  public static void main(String[] args) {
    List<Employee> eList = Employee.createShortList();
        
    System.out.println("\n== Average CO Bonus ==");
    OptionalDouble result;
        
    result = eList.stream()
      .filter(e -> e.getRole().equals(Role.EXECUTIVE))
      .filter(e -> e.getState().equals("CO"))
      .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
      .average();
        
    if (result.isPresent()){
      System.out.printf("Average Bonuses paid: $%,6.2f %n", 
        result.getAsDouble());
    }

    System.out.println("\n== Average CO Bonus Details ==");
        
    result = eList.stream()
      .filter(e -> e.getRole().equals(Role.EXECUTIVE))
      .filter(e -> e.getState().equals("CO"))
      .peek(e -> System.out.print("Name: " + e.getGivenName() 
          + " " + e.getSurName() + " "))
      .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
      .peek(d -> System.out.printf("Bonus paid: $%,6.2f %n", d))
      .average();
        
      if (result.isPresent()){
        System.out.printf("Average Bonuses paid: $%,6.2f %n", 
          result.getAsDouble());
      }    
  }   
}