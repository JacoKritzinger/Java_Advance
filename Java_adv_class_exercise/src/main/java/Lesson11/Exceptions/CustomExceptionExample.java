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

public class CustomExceptionExample {

    public static void main(String[] args) {

        try {

            CustomExceptionExample.checkPassWord("pass");

        } catch (InvalidPasswordException e) {

            e.printStackTrace();

        }

        try {

            CustomExceptionExample.checkPassWord(null);

        } catch (InvalidPasswordException e) {

            e.printStackTrace();

        }

    }

    public static void checkPassWord(String pass) throws InvalidPasswordException {

        int minPassLength = 5;

        try {

            if (pass.length() < minPassLength) {
                throw new InvalidPasswordException("The password provided is too short");
            }

        } catch (NullPointerException e) {

            throw new InvalidPasswordException("No password provided", e);

        }
    }
}


class InvalidPasswordException extends Exception {

    InvalidPasswordException() {
    }

    InvalidPasswordException(String message) {

        super(message);
    }

    InvalidPasswordException(String message, Throwable cause) {

        super(message, cause);
    }
}
