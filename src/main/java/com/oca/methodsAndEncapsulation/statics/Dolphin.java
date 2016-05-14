package com.oca.methodsAndEncapsulation.statics;

/**
 * @author mcrassin
 * @since 14/05/2016
 */
public class Dolphin {
    // executed first
    static { // but count is already declared.
        count = 4;
        System.out.println("dolphin static: order is important here, thus it will be replaced by 5.");
    }
    // then this one
    static int count = 5;
    // then this one
    static { // but count is already declared.
        count = 6;
        System.out.println("dolphin static: last statement, final value of count 6.");
    }

    String name;

    Dolphin(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hey, i'm " + name + " the dolphin.");
    }

    public static void main(String[] args) {
        System.out.println("There are " + count + " animals in the zoo, and " + Dolphin.count + " of them are dolphins.");
    }

}
