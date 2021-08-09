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
public class RoboCallTest01 {
  
  public static void main(String[] args) {
    
    List<Person> pl = Person.createShortList();
    RoboCall01 robo = new RoboCall01();
    
    System.out.println("\n==== RoboCall Test 01 ====");
    System.out.println("\n=== Calling all Drivers ===");
    robo.callDrivers(pl);
    
    System.out.println("\n=== Emailing all Draftees ===");
    robo.emailDraftees(pl);
    
    System.out.println("\n=== Mail all Pilots ===");
    robo.mailPilots(pl);
    
  }

}

