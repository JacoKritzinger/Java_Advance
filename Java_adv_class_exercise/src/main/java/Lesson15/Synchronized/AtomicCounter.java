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

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
  private static AtomicInteger i = new AtomicInteger();
  
  public void increment(){
    i.incrementAndGet();
  }
  
  public void decrement(){
    i.decrementAndGet();
  }
  
  public int getValue(){
    return i.get();
  }  
}
