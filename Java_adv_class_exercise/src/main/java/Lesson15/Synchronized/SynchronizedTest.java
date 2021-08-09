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

public class SynchronizedTest {
  public static void main(String[] args) {
    ExecutorService es = Executors.newFixedThreadPool(3);
    
    es.submit(new SynchronizedCounterRunnable(10, "A"));
    es.submit(new SynchronizedCounterRunnable(10, "B"));
    es.submit(new SynchronizedCounterRunnable(10, "C"));    
    
    es.shutdown();
  }
}
