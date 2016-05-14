package com.oca.methodsAndEncapsulation.statics;

/**
 * Access static variable using a null instance of the class.
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class StaticExample {

    public static void main(String[] args) {
        System.out.println("create a dolphin");
        Dolphin d1 = new Dolphin("brandon");    // first access to Dolphin class, java perform Dolphin static init before.
        d1.sayHello();
        System.out.println("destroy the dolphin, no ... ");
        d1 = null;
        System.out.println("dolphin count: " + d1.count);       // no null pointer exception, we're accessing static value
        System.out.println("dolphin count: " + Dolphin.count);

        d1.main(new String[0]); // calling static method is also allowed. even if d1 is null.
    }


}
