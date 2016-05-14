package com.oca.methodsAndEncapsulation.statics;

import java.util.ArrayList;
import java.util.List;

/**
 * final <=> should be assigned only ONCE.
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class StaticFinalExample {
    static final String aConstant = "Yeah";
    static final List finalList = new ArrayList<>();

    public static void main(String[] args) {

        //aConstant = "ahah"; // DOES NOT COMPILE, can not be updated after init phase.
        System.out.println("welcome message: " + aConstant);
        System.out.println();

        //
        System.out.print("final list is empty: ");
        displayList(finalList);

        finalList.add("test");

        System.out.print("final list is not empty anymore, we were able to update it: ");
        displayList(finalList);

        System.out.println("finalList is a reference variable, we can't reassigned it, but we can call methods on it.");

        //finalList = new ArrayList<>(); // DOES NOT COMPILE, we can't re-assigned the variable finalList after init phase.
    }

    static void displayList(List myList) {
        StringBuilder sb = new StringBuilder();
        for (Object elem : myList) {
            sb.append("" + elem.toString() + ", ");
        }
        System.out.println(sb.toString());
    }

}
