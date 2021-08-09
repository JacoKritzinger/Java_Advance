 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson13.IOFundamentals;

/**
 *
 * @author Jaco
 */
 
 public class Root {
     public static void main(String[] args) {
         int i = 2;
         double r = Math.sqrt(i);     
         System.out.print("The square root of ");
         System.out.print(i);
         System.out.print(" is ");
         System.out.print(r);
         System.out.println(".");
         i = 5;
         r = Math.sqrt(i);
         System.out.println("The square root of " + i + " is " + r + ".");
     }
 }