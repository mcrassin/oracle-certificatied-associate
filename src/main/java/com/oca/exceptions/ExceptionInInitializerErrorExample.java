package com.oca.exceptions;

/**
 * Show how java uses java.lang.ExceptionInInitializerError (subclass of Error)
 *  when fatal error occurs.
 *
 * @author mcrassin
 * @since 19/05/2016
 */
public class ExceptionInInitializerErrorExample {

    static {
        System.out.println("static init ...");
        String p = null;
        try {
            p.length(); // throws NullPointerException
        } finally {
            System.out.println("finally called anyway.");
        }
    }   // throws ExceptionInInitializerError (containing NullPointerException)

    public static void main(String[] args) {
        System.out.println("main program never starts ...");
    }

}
