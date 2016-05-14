package com.oca.methodsAndEncapsulation.accessModifiers.externalPackage;

import com.oca.methodsAndEncapsulation.accessModifiers.firstPackage.Bird;

/**
 * Different package, no inheritance.
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class ZooKeeper {

    public static void main(String[] args) {
        Bird b1 = new Bird();
        //b1.swim();  // protected access not allowed - DOES NOT COMPILE

//        System.out.println(b1.testPrivate);  // not in the same class - DOES NOT COMPILE
//        System.out.println(b1.testDefault);  // different package - DOES NOT COMPILE
//        System.out.println(b1.testProtected);// different package, no inheritance - DOES NOT COMPILE
        System.out.println(b1.testPublic);   // everybody


    }

}
