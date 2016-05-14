package com.oca.methodsAndEncapsulation.accessModifiers.externalPackage;

import com.oca.methodsAndEncapsulation.accessModifiers.firstPackage.Bird;

/**
 * Different package, child class of Bird.
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class Eagle extends Bird {

    public void fly() {
        //System.out.println(testPrivate);  // DOES NOT COMPILE
        //System.out.println(testDefault);  // DOES NOT COMPILE
        System.out.println(testProtected);  // works because of inheritance relationship
        System.out.println(testPublic);     // everybody
    }

    public static void main(String[] args) {
        Eagle e1 = new Eagle();
        e1.swim();
        e1.fly();

        //System.out.println(e1.testPrivate);  // DOES NOT COMPILE
        //System.out.println(e1.testDefault);  // DOES NOT COMPILE
        System.out.println(e1.testProtected);  // not the same package, but works because of inheritance relationship, even if in static method !!
        System.out.println(e1.testPublic);     // everybody
    }
}
