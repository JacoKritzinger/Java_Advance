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
public class Cat extends Animal implements Pet {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    public Cat(String name) {
        super(4);
        this.name = name;
    }
    
    public Cat() {
        this("fluffy");
    }
    
    @Override
    public void play() {
        System.out.println(name + "Likes to play with string.");
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }
    
    
}
