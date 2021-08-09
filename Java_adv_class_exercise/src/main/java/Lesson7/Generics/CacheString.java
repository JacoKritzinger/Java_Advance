/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7.Generics;

/**
 *
 * @author Jaco
 */
public class CacheString {
  
    private String message;
  
    public void add(String message){
        this.message = message;
    }
  
    public String get(){
        return this.message;
    }  
  
}
