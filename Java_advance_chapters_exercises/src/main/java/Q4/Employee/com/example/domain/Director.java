/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4.Employee.com.example.domain;

/**
 *
 * @author Jaco
 */
public class Director extends Manager {
    double budget;
    
    public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
            super(empId, name, ssn, salary, deptName);
            this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nBudget:          " + getBudget();
    }
    
}
        
