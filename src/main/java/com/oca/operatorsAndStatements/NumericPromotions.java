package com.oca.operatorsAndStatements;

/**
 * @author mcrassin
 * @since 10/04/2016
 */
public class NumericPromotions {

    public NumericPromotions() {

    }

    public static void main(String[] args) {
        short var = 32000;
        System.out.println("byte, short & char are auto promoted to int if used with operator, the result is too large to fit a short:" + var * 3);
    }

}
