/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.SalesTxn09;

/**
 *
 * @author Jaco
 */
import java.util.function.DoubleFunction;

public class A06DoubleFunction {

  public static void main(String[] args) {
        
    A06DoubleFunction test = new A06DoubleFunction();
        
    DoubleFunction<String> calc = 
          t -> String.valueOf(t * 3);
        
    String result = calc.apply(20);
    System.out.println("New value is: " + result);        
  }      
}