package com.oca.coreAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mat on 10/05/2016.
 */
public class Autoboxing {

    public static void main(String... args) {
        List<Double> listDouble = new ArrayList<Double>();

        System.out.println("Autoboxing from primitive to wrapper class, in order to add it to the list:");
        listDouble.add(50.5);
        listDouble.add(5.0);
        listDouble.add(new Double(99));
        //listDouble.add(50); // DO NOT COMPILE
        //listDouble.add(50.0f); // DO NOT COMPILE
        // displaying list
        displayList(listDouble);
        System.out.println();

        System.out.println("Autoboxing works as well with remove, but remove is overloaded with int param to remove a given index:");
        //listDouble.remove(99); // remove index 99
        listDouble.remove(99.0); // autobox to wrapper to delete 3rd value
        // displaying list
        displayList(listDouble);

        System.out.println("Try to insert null & get it:");
        listDouble.add(null); // allowed, we're using the wrapper class.
        System.out.println("display as Double, works:");
        System.out.println(listDouble.get(2));
        System.out.println("display as double, throws NullPointerException:");
        try {
            double d = listDouble.get(2);
            System.out.println(d);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("error caught: " + e.getClass().getSimpleName());
        }
        System.out.println();

        System.out.println("Values can not be autoboxed twice:");
        functionTestWrapper(4L);    // works: long => Long
        functionTestPrimitive(4);   // works: int => long
        //functionTestWrapper(4);   // DOES NOT COMPILE: int => long => Long
    }

    static void functionTestWrapper(Long longParam) {
        System.out.println("longParam=" + longParam);
    }
    static void functionTestPrimitive(long longParam) {
        System.out.println("longParam=" + longParam);
    }

    static void displayList(List myList) {
        StringBuilder sb = new StringBuilder();
        for (Object elem : myList) {
            sb.append("" + elem.toString() + ", ");
        }
        System.out.println(sb.toString());
    }

}
