package com.oca.methodsAndEncapsulation.accessModifiers.firstPackage;

import com.oca.methodsAndEncapsulation.accessModifiers.firstPackage.Bird;

/**
 * Person, same package as Bird, no inheritance relationship.
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class Person {

    public static void main(String... args) {
        Bird b1 = new Bird();
        b1.swim();
    //System.out.println(b1.testPrivate);       // private <=> class only - DOES NOT COMPILE
        System.out.println(b1.testDefault);     // default <=> package private access
        System.out.println(b1.testProtected);   // protected <=> package private & inheritance accesses
        System.out.println(b1.testPublic);      // public <=> everybody
    }

}
