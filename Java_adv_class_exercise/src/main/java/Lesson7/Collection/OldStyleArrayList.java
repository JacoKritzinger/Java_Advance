/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7.Collection;

/**
 *
 * @author Jaco
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class OldStyleArrayList {
  public static void main(String args[]){  
    List partList = new ArrayList(3);
    
    partList.add(new Integer(1111));
    partList.add(new Integer(2222));
    partList.add(new Integer(3333));
    partList.add("Oops a string!");

    Iterator elements = partList.iterator();    
    while (elements.hasNext()) {
      Integer partNumberObject = (Integer) (elements.next()); // error?
      int partNumber = (int) partNumberObject.intValue();
      
      System.out.println("Part number: " + partNumber);
    }       
  } 
}
