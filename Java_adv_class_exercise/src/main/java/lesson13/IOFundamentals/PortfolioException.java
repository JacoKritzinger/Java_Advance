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

public class PortfolioException extends Exception {
    private static final long serialVersionUID = 102L;
    public PortfolioException (String message) {
        super(message);
    }
    public PortfolioException (String message, Throwable t) {
        super (message, t);
    }
}
