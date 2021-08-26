/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q6_1Pet;

/**
 *
 * @author Jaco
 */
public class Fish extends Animal implements Pet {
    private String name;
    
    public Fish() {
        super(0);
    }

    @Override
     public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void play() {
        System.out.println("Just keep swimming.");
    }
    
    @Override
    public void eat() {
        System.out.println("Fish eat the scum of the pond.");
    }
    
    public void walk() {
        super.walk();
    System.out.println("Fish, of course, can't walk; they swim.");
    }
    
    
}
