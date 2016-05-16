package com.oca.classDesign.constructors;

/**
 * Example of parent class constructor call auto insertion, if missing
 *  first instruction of Triangle() constructor will be super();
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class Triangle extends Shape {

    public Triangle() {
        // we're NOT calling the parent constructor
    }

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        // Shape constructor is called anyway
        //  because super() is inserted automatically.

        // Note: if there is no no args constructor in the parent class,
        //      a proper call to super must be done, or it would not compile!!
    }
}
