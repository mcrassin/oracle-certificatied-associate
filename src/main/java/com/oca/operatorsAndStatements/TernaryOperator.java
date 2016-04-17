package com.oca.operatorsAndStatements;

import java.io.Serializable;

/**
 * @author mcrassin
 * @since 17/04/2016
 */
public class TernaryOperator {

    public static void main(String[] args) {

        int var = 0;

        System.out.println("-- Ternary int & String with overloaded println function:");
        System.out.println(var == 0 ? 45 : "ternary");
        System.out.println(var != 0 ? 45 : "ternary");

        System.out.println("-- Ternary int & String with Serializable I/F :");
        Serializable test3 = (var == 0 ? 45 : "ternary");
        System.out.println("Serializable=" + test3);
        Serializable test4 = (var != 0 ? 45 : "ternary");
        System.out.println("Serializable=" + test4);

        System.out.println("-- Ternary int & String with variables :");
//        String test1 = (var == 0 ? 45 : "ternary");
//        int test2 = (var != 0 ? 45 : "ternary");
    }

}
