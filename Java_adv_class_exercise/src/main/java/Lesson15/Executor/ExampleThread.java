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

public class ExampleThread extends Thread {
    private final String name;
    
    public ExampleThread(String name){
        this.name = name;
    }
    
    @Override
    public void run(){  
        for (int i = 0; i < 1000; i++) {
            System.out.println(name + ":" + i);        
        }
    } 
}
