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
public enum PoloShirt {
    Blue("1111", "Blue Cotton Polo"),
    Black("2222", "Black Cotton Polo"),
    Maroon("3333", "Maroon Cotton Polo");
    
    private final String partNumber;
    private final String description;
    
    private PoloShirt(String partNumber, String description){
        this.partNumber = partNumber;
        this.description = description;
    }
    public String getPartNumber(){ return this.partNumber; }
    public String getDescription(){ return this.description; }
}
