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

public class AtomicCounterRunnable implements Runnable{
  private AtomicCounter count = new AtomicCounter();
  private int countSize = 0;
  private String threadName;
  
  public AtomicCounterRunnable(){
    super();
  }
  
  public AtomicCounterRunnable(int countSize, String threadName){
    this.countSize = countSize;
    this.threadName = threadName;
  }
  
  @Override
  public void run(){
    for (int i = 0; i < countSize; i++){
        count.increment();
        System.out.println(threadName 
             + " Current Count: " + this.getCounter());
    }
  }
  
  public synchronized int getCounter(){
    return count.getValue();
  }
}
