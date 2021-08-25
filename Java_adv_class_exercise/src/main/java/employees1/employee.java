/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees1;

/**
 *
 * @author Jaco
 */
public class employee {
    private int empId;
    private String name;
//     lines omitted
    
    public String getDetails() {
        return "ID: " + empId + " Name: " + name;
    }
}
