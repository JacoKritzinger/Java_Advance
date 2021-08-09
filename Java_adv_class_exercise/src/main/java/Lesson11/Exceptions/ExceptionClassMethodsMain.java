/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11.Exceptions;

/**
 *
 * @author Jaco
 */
import java.io.FileInputStream;
import java.io.InputStream;

public class ExceptionClassMethodsMain {


    public static void main(String[] args) {
        
        try {
            System.out.println("About to open a file");
            InputStream in = new FileInputStream("missingfile.txt");
            System.out.println("File open");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }     
    }
}
