package com.oca.methodsAndEncapsulation.statics;

/**
 * @author mcrassin
 * @since 14/05/2016
 */
public class StaticInitializers {

    public static void main(String[] args) {
        System.out.println("dolphin count: " + Dolphin.count);
        Dolphin.count = 4;
        System.out.println("dolphin count: " + Dolphin.count);

        Dolphin d1 = new Dolphin("mich");   // static variable already initialized and modified. does not change them.
        d1.sayHello();

        System.out.println("dolphin count: " + Dolphin.count);  // still 4.
    }


}
