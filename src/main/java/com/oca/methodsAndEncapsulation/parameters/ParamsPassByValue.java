package com.oca.methodsAndEncapsulation.parameters;

import java.util.ArrayList;
import java.util.List;

/**
 * Passed by value
 *
 * primitive, a copy is given to the method
 * object, a copy of the pointer is given to the method
 *  thus, re assignation have no effect on the outside caller
 *  but calling a method on the object will,
 *  unless the object is an immutable class (like String)
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class ParamsPassByValue {

    public static void aMethod(int param1, String param2, List param3) {
        System.out.println("aMethod is called.");
        param1 = 56;
        param2 = "aMethod called";
        param3.add("aMethod called");
    }
    public static void aMethodTryingToReassignList(List param3) {
        System.out.println("aMethodTryingToReassignList is called.");
        param3 = new ArrayList<>(); // erase everything ?
    }


    public static void display(int param1, String param2, List param3) {
        System.out.println("param1=" + param1);
        System.out.println("param2=" + param2);
        System.out.print("param3=");
        displayList(param3);
    }

    public static void main(String[] args) {

        int p1 = 0;
        String p2 = "empty";
        List p3 = new ArrayList<String>() {{
            add("one value");
        }};

        System.out.println("Before:");
        display(p1, p2, p3);
        System.out.println();

        /**
         * No changes on:
         *  - p1, because it's a primitive
         *  - p2, because it's a immutable object
         *
         * Changes on:
         *  - p3, because it's an object (not immutable)
         */
        aMethod(p1, p2, p3);
        System.out.println();

        System.out.println("After: just param3 were updated ... ");
        display(p1, p2, p3);
        System.out.println();

        aMethodTryingToReassignList(p3);
        System.out.println();

        System.out.println("After: re-assignation has no affect has the method has a copy of the pointer ... ");
        display(p1, p2, p3);
    }

    static void displayList(List myList) {
        StringBuilder sb = new StringBuilder();
        for (Object elem : myList) {
            sb.append("" + elem.toString() + ", ");
        }
        System.out.println(sb.toString());
    }
}
