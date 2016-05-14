package com.oca.methodsAndEncapsulation.constructors;

/**
 * Example of simple auto constructor insertion when missing.
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class Square extends Shape {

    /*NO CONSTRUCTOR explicitly defined*/

/* This constructor will be auto inserted by Java.
    public Square() {
        super();
    }
*/

    public static void main(String[] args) {
        Shape square = new Square();
        // constructor of Shape is called auto.
        //  because a default constructor is auto. inserted in any class. if none is defined.
    }

}
