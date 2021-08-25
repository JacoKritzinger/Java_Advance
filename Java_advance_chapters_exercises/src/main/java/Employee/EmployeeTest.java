/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import Q3.Employee.com.example.domain.Employee;
/**
*
 * @author Jaco
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee ();
        emp.setEmpId(101);
        emp.setName("Jaco Kritzinger");
        emp.setSsn("012-345-6789");
        emp.setSalary(185_000.50);
        emp.printEmployee();
//        System.out.println("Employee id:           " + emp.getEmpId());
//        System.out.println("Employee name:         " + emp.getName());        
//        System.out.println("Employee Soc Sec :     " + emp.getSsn());            
//        System.out.println("Employee salary:       " + emp.getSalary());
    }
 
}
