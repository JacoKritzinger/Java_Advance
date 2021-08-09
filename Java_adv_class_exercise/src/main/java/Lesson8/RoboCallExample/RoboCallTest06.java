/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8.RoboCallExample;

import java.util.List;

/**
 *
 * @author Jaco
 */
public class RoboCallTest06 {
  
  public static void main(String[] args){ 

    List<Person> pl = Person.createShortList();
    
    System.out.println("\n=== Print List ===");
    pl.forEach(p -> System.out.println(p));
        
  }
}