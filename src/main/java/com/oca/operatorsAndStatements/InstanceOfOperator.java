package com.oca.operatorsAndStatements;

/**
 * instanceof operator:
 *  object instanceof class
 *
 * The first param 'object' should be an object (it cannot be a class)
 * The second param 'class' has to be a class (it cannot be an object, nor a object.getClass())
 *
 * @author mcrassin
 * @since 31/05/2016
 */
class MyBase {}

class MyDerived1 extends MyBase {}

class MyDerived2 extends MyBase {}

public class InstanceOfOperator {

    public static void main(String[] args) {
        MyBase base = new MyBase();
        MyDerived1 derived1 = new MyDerived1();
        MyDerived2 derived2 = new MyDerived2();

        System.out.println("derived1 instanceof MyBase => " + (derived1 instanceof MyBase));
        System.out.println("derived2 instanceof MyBase => " + (derived2 instanceof MyBase));
        System.out.println("base instanceof MyDerived1 => " + (base instanceof MyDerived1));
//        System.out.println("derived1 instanceof base => " + (derived1 instanceof base));    // DOES NOT COMPILE, unknown class 'base'

        // TODO: caster 2 class fils ?


    }

}
