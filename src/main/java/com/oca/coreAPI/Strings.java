package com.oca.coreAPI;

import java.time.LocalTime;
import java.time.temporal.TemporalUnit;

/**
 * @author mcrassin
 * @since 24/04/2016
 */
public class Strings {

    public static void main(String[] args) {
        stringPool();
        substringMethods();
        replaceMethods();
        comparisonStringBuilderAndBuffer();
    }

    private static void stringPool() {
        String s1 = "abc";  // 'abc' created in thread pool
        String s2 = "abc";  // s2 points to 'abc' in thread pool

        if (s1 == s2) {
            System.out.println("both s1 and s2 point to the same address");
        }

        String s3 = new String("abc");
        if (s1 != s3) {
            System.out.println("As new operator is used, the String is not stored in the string pool, and thus address are different.");
        }
    }

    private static void comparisonStringBuilderAndBuffer() {
        int times=100000;
        {
            LocalTime before = LocalTime.now();
            StringBuffer sbuff = new StringBuffer();
            for (int i = 0; i < times; i++) {
                sbuff.append("test ");
            }
            System.out.println(sbuff.toString());
            LocalTime after = LocalTime.now();
            System.out.println("stringbuffer (thread safe):" + (after.toNanoOfDay() - before.toNanoOfDay()) / 1000000);
        }

        {
            LocalTime before = LocalTime.now();
            StringBuilder sbuilder = new StringBuilder();
            for (int i = 0; i < times; i++) {
                sbuilder.append("test ");
            }
            System.out.println(sbuilder.toString());
            LocalTime after = LocalTime.now();
            System.out.println("stringbuilder (faster):" + (after.toNanoOfDay() - before.toNanoOfDay()) / 1000000);
        }
    }

    private static void substringMethods() {
        String test = "un test";
        System.out.println(test.substring(3,3)); // empty
        System.out.println(test.substring(0,2)); // 0 based index
    }

    private static void replaceMethods() {
        String test = "un test";
        System.out.println(test.replaceFirst("t", "T"));
        System.out.println(test.replace("t", "T"));
        System.out.println(test.replaceAll("t", "T"));
    }

}
