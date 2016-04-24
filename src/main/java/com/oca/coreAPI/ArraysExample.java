package com.oca.coreAPI;

import java.util.Arrays;

/**
 * @author mcrassin
 * @since 24/04/2016
 */
public class ArraysExample {

    public static void main(String[] args) {
        int[] tab = {1, 4, 6, 9, 16, 3, 45, 2, 99};
        displayTab(tab);
        System.out.println("binary search of 2 of non sorted tab: " + java.util.Arrays.binarySearch(tab, 2));
        System.out.println();

        Arrays.sort(tab);
        displayTab(tab);
        System.out.println("binary search of 2 of sorted tab: " + java.util.Arrays.binarySearch(tab, 2));

    }

    private static void displayTab(int[] tab) {
        System.out.print("{");
        for (int i=0; i<tab.length; i++) {
            System.out.print(tab[i] + ",");
        }
        System.out.println("}");
    }

}
