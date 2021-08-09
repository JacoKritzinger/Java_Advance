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
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class NumberUtil {
    public static void printNumbers(Collection<? extends Number> c){
        System.out.print("[  ");
        for (Number n:c){
            System.out.print(n + "  ");
        }
        System.out.println("]");
    }
    
    public static void main(String[] args){
        List<Integer> myInts = Arrays.asList(4, 5, 6); 
        List<Double> myDoubles = Arrays.asList(4.1, 5.2, 6.3);
        
        NumberUtil.printNumbers(myInts);
        NumberUtil.printNumbers(myDoubles);
    }
}
