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
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TestLocation {
    public static void main(String[] args){
        Set<Location> locationList = new TreeSet<>();
        locationList.addAll(Arrays.asList(Location.CzechRepublic, Location.Madagascar, Location.Russia));
        
        for(Location l:locationList){
            System.out.println(l.toString() + "--> Code = " + l.getCountry() + " Language = " + l.getLanguage());
        }
    }
}
