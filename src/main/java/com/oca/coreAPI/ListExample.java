package com.oca.coreAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mcrassin
 * @since 31/05/2016
 */
public class ListExample {

    public static void main(String[] args) {
        List test1 = new ArrayList<>();
        test1.add(1);   // add 1 at the end
        test1.add(0,3); // add 3 at index 0
        test1.add(1,2); // add 2 at index 1

        displayList(test1);
    }

    static void displayList(List myList) {
        StringBuilder sb = new StringBuilder();
        for (Object elem : myList) {
            sb.append("" + elem.toString() + ", ");
        }
        System.out.println(sb.toString());
    }
}
