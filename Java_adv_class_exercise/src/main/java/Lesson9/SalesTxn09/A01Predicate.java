/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.SalesTxn09;


import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Jaco
 */
public class A01Predicate {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    
    Predicate<SalesTxn> massSales = 
        t -> t.getState().equals(State.MA);
    
    System.out.println("\n== Sales - Stream");
    tList.stream()
        .filter(massSales)
        .forEach(t -> t.printSummary());
    
    System.out.println("\n== Sales - Method Call");    
    for(SalesTxn t:tList){
        if (massSales.test(t)){
            t.printSummary();
        }
    }
  }
}
