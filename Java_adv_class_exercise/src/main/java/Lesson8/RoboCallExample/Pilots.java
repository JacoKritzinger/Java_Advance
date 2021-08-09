/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8.RoboCallExample;


import java.util.function.Predicate;

/**
 *
 * @author Jaco
 */
public class Pilots implements Predicate<Person>{
    
    @Override
    public boolean test(Person p){
        return p.getAge() >= 23 && p.getAge() <= 65;
    }
}
