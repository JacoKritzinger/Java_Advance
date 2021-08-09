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

public class SynchronizedCounter {
  private static int i = 0;
  
  public synchronized void increment(){
    i++;
  }
  
  public synchronized void decrement(){
    i--;
  }
  
  public synchronized int getValue(){
    return i;
  }  
}
