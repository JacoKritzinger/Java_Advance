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



public enum Bonus {
    
    STAFF(0.02),
    MANAGER(0.04),
    EXECUTIVE(0.06);
    
    private final double percent;
    
    Bonus(double percent){
        this.percent = percent;
    }
    
    public double percent(){
        return percent;
    }
   
    public static double byRole(Role r){
        
        double bonusPercent = 0.0d;
        
        switch(r){
            case EXECUTIVE: bonusPercent = EXECUTIVE.percent; break;
            case MANAGER: bonusPercent = MANAGER.percent; break;
            case STAFF: bonusPercent = STAFF.percent; break;
        }
        
        return bonusPercent;
    }
    
    
}
