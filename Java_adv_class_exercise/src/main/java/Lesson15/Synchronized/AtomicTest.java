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


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicTest {
  public static void main(String[] args) {
    ExecutorService es = Executors.newFixedThreadPool(4);
    
    es.submit(new AtomicCounterRunnable(10, "A"));
    es.submit(new AtomicCounterRunnable(10, "B"));
    es.submit(new AtomicCounterRunnable(10, "C"));    
    
    es.shutdown();
  }
}
