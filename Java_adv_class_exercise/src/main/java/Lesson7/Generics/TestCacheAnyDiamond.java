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
public class TestCacheAnyDiamond {
    
    public static void main(String args[]){
        //Generics
        CacheAny<String> myGenericMessage = new CacheAny<>(); 
        CacheAny<Shirt> myGenericShirt = new CacheAny<>(); 
 
        // Add data and print
        myGenericMessage.add("Save this for me"); // Generic            
        System.out.println("Message is: " + myGenericMessage.get());        
        
        myGenericShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
        System.out.println("Shirt Type:" + myGenericShirt.get().toString());
    }
}
