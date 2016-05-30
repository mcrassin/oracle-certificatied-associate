package com.oca.buildingBlocs;

/**
 * Instance and static/class variables are auto given a default value.
 *
 * @author mcrassin
 * @since 30/05/2016
 */
public class StaticVarNotInitialized {
    static byte byteVar;
    static short shortVar;
    static int integerVar;
    static long longVar;
    static float floatVar;
    static double doubleVar;
    static String stringVar;
    static char charVar;

    public void print() {
        System.out.println("int=" + this.integerVar);
    }

    public static void main(String[] args) {
        System.out.println("byte=" + byteVar);
        System.out.println("short=" + shortVar);
//        System.out.println("integer=" + integerVar);
        new StaticVarNotInitialized().print();
        System.out.println("long=" + longVar);
        System.out.println("float=" + floatVar);
        System.out.println("double=" + doubleVar);
        System.out.println("string=" + stringVar);
        System.out.println("charVar=" + charVar);
    }

}
