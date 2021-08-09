/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8.RoboCallExample;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Jaco
 */
public class RoboCallTest05 {
  
  public static void main(String[] args){ 

    List<Person> pl = Person.createShortList();
    RoboCall05 robo = new RoboCall05();
    // Predicates
    Predicate<Person> allDrivers = p -> p.getAge() >= 16;
    Predicate<Person> allDraftees = p -> p.getAge() >= 18 
            && p.getAge() <= 25 && p.getGender() == Gender.MALE;
    Predicate<Person> allPilots = p -> p.getAge() >= 23 
                                        && p.getAge() <= 65;
    
    
    System.out.println("\n==== Robo Test 04 ====");
    System.out.println("\n=== Calling all Drivers ===");
    robo.phoneContacts(pl, allDrivers);
    
    System.out.println("\n=== Emailing all Draftees ===");
    robo.emailContacts(pl, allDraftees);
    
    System.out.println("\n=== Mail all Pilots ===");
    robo.mailContacts(pl, allPilots);
        
  }
}
