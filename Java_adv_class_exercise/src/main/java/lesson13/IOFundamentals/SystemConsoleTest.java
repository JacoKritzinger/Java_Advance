/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson13.IOFundamentals;

/**
 *
 * @author Jaco
 */

import java.io.Console;

public class SystemConsoleTest {

    public static void main(String[] args) {
        String username = "oracle";
        String password = "tiger";
        boolean userValid = false;
        Console cons;
        // Get a Console instance
        cons = System.console();
        if (cons != null) {
            String userTyped;
            String pwdTyped;
            do {
                userTyped = cons.readLine("%s", "User name: ");
                pwdTyped = new String(cons.readPassword("%s", "Password: "));
                if (userTyped.equals(username) && pwdTyped.equals(password)) {
                    userValid = true;
                } else {
                    System.out.println("User name and password do not match existing credentials.\nTry again.\n");
                }
            } while (!userValid);
            System.out.println("Success! you are now logged in.");
        } else {
            System.out.println("The console is not attached to this VM. Try running this application at the command-line.");
        }
    }
}