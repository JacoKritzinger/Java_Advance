/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.EmployeeSearch10;

/**
 *
 * @author Jaco
 */


public enum VacAccrual {
    
    STAFF((2*7)/365d),
    MANAGER((2.5*7)/365d),
    EXECUTIVE((3*7)/365d);
    
    private final double perDay;
    
    VacAccrual(double perDay){
        this.perDay = perDay;
    }
    
    public double perDay(){
        return perDay;
    }
    
    public static double byRole(Role r){
        double accrualRate = 0.0d;
        
        switch(r){
            case EXECUTIVE: accrualRate = EXECUTIVE.perDay; break;
            case MANAGER: accrualRate = MANAGER.perDay; break;
            case STAFF: accrualRate = STAFF.perDay; break;
        }
        
        return accrualRate;
    }
        
   
    
}
