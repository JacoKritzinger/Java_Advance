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
import java.util.Comparator;

public class StudentSortName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        int result = s1.getName().compareTo(s2.getName());
        if (result != 0) { return result; }
        else { 
            return 0;  // Or do more comparing
        } 
    }
}
