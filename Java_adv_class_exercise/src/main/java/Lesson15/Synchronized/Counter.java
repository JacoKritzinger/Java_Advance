/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson15.Synchronized;

/**
 *
 * @author Jaco
 */

public class Counter {
  private static int i = 0;
  
  public void increment(){
    i++;
  }
  
  public void decrement(){
    i--;
  }
  
  public int getValue(){
    return i;
  }
}
