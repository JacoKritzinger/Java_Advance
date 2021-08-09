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
public class CacheAny <T>{
      
    private T t;
  
    public void add(T t){
        this.t = t;
    }
  
    public T get(){
        return this.t;
    }  
}
