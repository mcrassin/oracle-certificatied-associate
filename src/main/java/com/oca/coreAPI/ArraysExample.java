package com.oca.coreAPI;

import java.util.Arrays;
import java.util.List;

/**
 * @author mcrassin
 * @since 24/04/2016
 */
public class ArraysExample {

    public static void main(String[] args) {
        Integer[] tab = {1, 4, 6, 9, 16, 3, 45, 2, 99};
        displayTab(tab);
        System.out.println("* binary search of 2 of non sorted tab: " + java.util.Arrays.binarySearch(tab, 2));
        System.out.println();

        Arrays.sort(tab);
        displayTab(tab);
        System.out.println("* binary search of 2 of sorted tab: " + java.util.Arrays.binarySearch(tab, 2));
        System.out.println();

        // convert to list
        System.out.println("* backed list of our array");
        List<Integer> list = Arrays.asList(tab);
        displayTab(list);
        System.out.println("replace inside tab 1 by 11 at index 0.");
        tab[0] = 11;
        displayTab(list);
        System.out.println("value is replaced inside in list automatically");

        System.out.println("replace inside list 11 by 5 at index 0.");
        //list.remove(0); // throws UnsupportedOperationException
        //list.add(0, 5); // throws UnsupportedOperationException
        displayTab(tab); // not reached

        // convert list back to array
        System.out.println("Convert back list to an integer array:");
        Integer[] intTabsWithCast = (Integer[]) list.toArray();
        Integer[] intTabs = list.toArray(new Integer[0]);
        //String[] intTabsString = list.toArray(new String[0]); //throws java.lang.ArrayStoreException
        displayTab(intTabs);
    }

    private static void displayTab(Integer[] tab) {
        System.out.print("{");
        for (int i=0; i<tab.length; i++) {
            System.out.print(tab[i] + ",");
        }
        System.out.println("}");
    }
    private static void displayTab(List list) {
        System.out.print("{");
        for (Object i : list) {
            System.out.print(i + ",");
        }
        System.out.println("}");
    }

}
