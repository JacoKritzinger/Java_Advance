/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.SalesTxn09;

import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author Jaco
 */
public class A07Binary {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);            
    String testState = "CA";
    
    BiPredicate<SalesTxn,String> stateBiPred = 
      (t, s) -> t.getState().getStr().equals(s);
    
    System.out.println("\n== First is CA?");
    System.out.println(
      stateBiPred.test(first, testState));
  }
}
