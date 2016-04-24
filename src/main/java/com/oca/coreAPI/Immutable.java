package com.oca.coreAPI;

import java.io.Serializable;

/**
 * @author mcrassin
 * @since 17/04/2016
 */
public class Immutable {

/*
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println((rt.freeMemory() / 1024) + "/" + (rt.maxMemory() / 1024) + " kB");

        long freeMem = rt.freeMemory();

        String s = "";
        for (int i=0; i<1000; i++) {
            s = s + i;
        }

        long freeMemAfter = rt.freeMemory();
        System.out.println("delta memory = " + (freeMem-freeMemAfter)/1024 + " kB");
        System.out.println((rt.freeMemory() / 1024) + "/" + (rt.maxMemory() / 1024) + " kB");
    }
*/

    /**
     * String pool is used by default to store strings, declared without new keyword.
     * Thus, 2 identical strings have the same address, from the string pool.
     *
     * Strings declared with new keyword do not end up in the string pool.
     *
     * @param args
     */
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println("s1=" + s1);
        System.out.println("s1 has same address as 'hello' from the string pool: " + (s1 == "hello"));
        System.out.println();

        String s2 = s1 + " concatenated";
        System.out.println("s2=" + s2);
        System.out.println("s1 & s2 have the same address: " + (s1 == s2));
        System.out.println("s2 has also same address as 'hello concatenated' from the string pool: " + (s2 == "hello concatenated"));
        System.out.println("s2 has also same address as 'hello concatenated' from the string pool intern(): " + (s2.intern() == "hello concatenated"));
        System.out.println();

        String s3 = new String("hello");
        System.out.println("s3 = new String(hello)");
        System.out.println("s1 & s3 have the same address: " + (s1 == s3));
    }

}
