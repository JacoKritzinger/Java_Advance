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
public class ArrNumberUtil {
    public static void printNumberArray(Number[] numArr){
        System.out.print("[  ");
        for (Number n:numArr){
            System.out.print(n + "  ");
        }
        System.out.println("]");
    }
    
    public static void main(String[] args){
        Integer[] intArr = {4, 5, 6};
        Double[] doubleArr = {4.1, 5.2, 6.3};
        
        ArrNumberUtil.printNumberArray(intArr);
        ArrNumberUtil.printNumberArray(doubleArr);
    }   
}
