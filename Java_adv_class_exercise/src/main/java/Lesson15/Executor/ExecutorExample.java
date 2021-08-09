/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson15.Executor;

/**
 *
 * @author Jaco
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorExample {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.execute(new ExampleRunnable("one"));
        es.execute(new ExampleRunnable("two"));        
        es.shutdown();
    }
}
