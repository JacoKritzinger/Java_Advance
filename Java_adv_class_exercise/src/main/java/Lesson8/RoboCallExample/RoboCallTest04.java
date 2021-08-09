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
public class RoboCallTest04 {

  public static void main(String[] args) {
    
    List<Person> pl = Person.createShortList();
    RoboCall03 robo = new RoboCall03();
    
    System.out.println("\n==== Robo Test 03 ====");
    System.out.println("\n=== Calling all Drivers ===");
    robo.phoneContacts(pl, (Person p) -> p.getAge() >=16);
    
    System.out.println("\n=== Emailing all Draftees ===");
    robo.emailContacts(pl, 
        p -> p.getAge() >= 18 && p.getAge() <= 25 
                && p.getGender() == Gender.MALE);
    
    
    System.out.println("\n=== Mail all Pilots ===");
    robo.mailContacts(pl, p -> p.getAge() >= 23 && p.getAge() <= 65);
    
    System.out.println("\n=== Phone all Pilots ===");
    Pilots allPilots = new Pilots(); // Concrete class version
    robo.phoneContacts(pl, allPilots);
  }
}
