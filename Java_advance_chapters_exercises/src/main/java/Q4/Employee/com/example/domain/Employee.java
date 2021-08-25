/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4.Employee.com.example.domain;

import java.text.NumberFormat;
        
        

/**
 *
 * @author Jaco
 */
public class Employee {
          
    private int empId;
    private String name;
    private String ssn;
    private double salary;
    
    
    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
        
    }

    public Employee() {
        
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void raiseSalary(double increase)  {
        salary += increase;
    }

    public int getEmpId() {
        return empId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID: "   + getEmpId()
                + "\n" +"Employee Name: " + getName()
                + "\n" +"Employee SSN: " + getSsn() 
                + "\n" +"Employee Salary: " +NumberFormat.getCurrencyInstance().format(getSalary());
    }
    
    public void printEmployee() {

        System.out.println();
        System.out.println("Employee id:         " + getEmpId());
        System.out.println("Employee name:       " + getName());
        System.out.println("Employee SSN:  " + getSsn());
        System.out.println("Employee salary:     " + NumberFormat.getCurrencyInstance().format((double) getSalary()));
    }
    

}