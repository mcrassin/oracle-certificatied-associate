package com.oca.coreAPI;

import java.time.LocalTime;
import java.time.temporal.TemporalUnit;

/**
 * @author mcrassin
 * @since 24/04/2016
 */
public class Strings {

    public static void main(String[] args) {
        substringMethods();
        replaceMethods();
        comparisonStringBuilderAndBuffer();
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
