package com.oca.operatorsAndStatements;

/**
 * @author mcrassin
 * @since 22/05/2016
 */
public class IncrementOperators {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("i = " + i);
        int res = ++i + ++i;
        System.out.println("++i + ++i = " + res);
        System.out.println("i: " + i);

    }

}
