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

public class CounterRunnable implements Runnable{
  private Counter count = new Counter();
  private int countSize = 0;
  private String threadName;
  
  public CounterRunnable(){
    super();
  }
  
  public CounterRunnable(int countSize, String threadName){
    this.countSize = countSize;
    this.threadName = threadName;
  }
  
  @Override
  public void run(){
    for (int i=0; i < countSize; i++){
      count.increment();
      System.out.println(threadName + " Current Count: " + count.getValue());
    }
  }
}
