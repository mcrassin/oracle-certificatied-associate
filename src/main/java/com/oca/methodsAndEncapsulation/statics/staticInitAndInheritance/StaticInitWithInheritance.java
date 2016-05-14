package com.oca.methodsAndEncapsulation.statics.staticInitAndInheritance;

import com.oca.methodsAndEncapsulation.statics.StaticAndInstanceInitializers;

/**
 * Adding inheritance in static & instance init block, inline init, and constructor.
 *  Parent init are always done before child init.,
 *      and parent constructor is even called before child instance init block!
 *
 * STATIC:
 * 1/ parent static init block
 * 2/ child static init block
 *
 * INSTANCE:
 *  - PARENT
 * 3/ parent instance init block
 * 4/ parent constructor
 *  - CHILD
 * 5/ child instance init block
 * 6/ child constructor
 *
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class StaticInitWithInheritance extends StaticAndInstanceInitializers {

    {
        System.out.println("[Child class] instance init block");
    }

    static {
        System.out.println("[Child class] static init block");
    }

    StaticInitWithInheritance() {
        System.out.println("[Child class] constructor");
    }

    public static void main(String[] args) {
        System.out.println("main start.");

        StaticInitWithInheritance object = new StaticInitWithInheritance();

        System.out.println("main end.");
    }

}
