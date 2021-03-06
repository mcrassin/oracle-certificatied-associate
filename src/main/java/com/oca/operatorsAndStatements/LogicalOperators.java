package com.oca.operatorsAndStatements;

/**
 * Show various logical/bitwise operators
 *
 * binary, base 2:
 *  8 in decimal, is in binary: 1000
 *  highest bit on the left, lowest on the right
 *
 * thus, shift operators:
 *  << 1 is equivalent to multiply by 2
 *  >> 1 is equivalent to divide by 2
 *
 * regular operators:
 *  &   AND
 *  |   OR
 *  ^   XOR
 *
 * @author mcrassin
 * @since 22/05/2016
 */
public class LogicalOperators {

    public static void main(String[] args) {
        int val = 32 + 8 + 4 + 2 +1;
        int mask = 32 + 16 + 8; /*keep only high value bits*/
        int res = val & mask;

        /**
         * operators precedence / order
         */
        int var1 = 3;
        int hugeOperation = 3 << 1 + -2 * -++var1 - 7;
        //                  3 << 1 + -2 * -4 - 7
        //                  3 << 1 + 8 - 7
        //                  3 << 9 - 7
        //                  3 << 2      mean 3 shift 2 times on the left
        //                  3 * 2 * 2
        //                  12
        System.out.println("huge operation result: " + hugeOperation);

        /**
         * shift operator before and operator.
         */
        hugeOperation = 0x000F & 2 << 3;
        //              0x000F & 16
        //              15 & 16
        //              000001111
        //             & 00010000
        //              0
        System.out.println("second operation result: " + hugeOperation);
        System.out.println();

        /**
         * Showing a AND operator
         */
        System.out.println("AND operator:");
        System.out.println("val:\t\t" + Integer.toString(val,2) + " => " + val);
        System.out.println("mask:\t\t" + Integer.toString(mask,2) + " => " + mask);
        System.out.println("val & mask:\t" + Integer.toString(res, 2) + " => " + res);
        System.out.println();

        /**
         * Showing XOR operator <=> elusive or
         */
        System.out.println("XOR operator:");
        System.out.println("8\t\t" + Integer.toString(8, 2));
        System.out.println("11\t\t" + Integer.toString(11, 2));
        System.out.println("8 ^ 11\t00" + Integer.toString(8 ^ 11, 2) + " => " + (8 ^ 11));
        System.out.println();

        /**
         * Shifts
         */
        System.out.println("Shift operators:");
        System.out.println("8\t\t0" + Integer.toString(8, 2));
        System.out.println("8 >> 2\t000" + Integer.toString(8 >> 2, 2)+ " => " + (8 >> 2));
        System.out.println("8 >>> 2\t000" + Integer.toString(8 >>> 2, 2)+ " => " + (8 >>> 2));
        System.out.println("8 << 1\t" + Integer.toString(8 << 1, 2)+ " => " + (8 << 1));
        System.out.println();

        /**
         * Signed & unsigned shift operators
         */
        System.out.println("signed >> & unsigned >>> shift:");
        int signed = -119;
        System.out.println("                          " + Integer.toString(signed, 2) + " => " + signed);
        System.out.println("1111111 11111111 11111111 10001001 => complete notation ( & MaxIntValue-1) for signed value");

        int calcSigned = signed << 24 >> 24;
        System.out.println("performing << 24 >> 24 or >>> 24, in order to drop bits from 8-31 ... ");
        System.out.println("signed                    " + Integer.toString(calcSigned, 2) + " => " + calcSigned);
        int calcUnsigned = signed << 24 >>> 24;
        System.out.println("unsigned                  " + Integer.toString(calcUnsigned, 2) + " => " + calcUnsigned);

        /**
         * unary complement bitwise operator
         */
//        byte test1 = 129;     // DOES NOT COMPILE
        byte test1 = 56;
        System.out.println("my byte: " + test1 + " and the complement: " + (~test1));

    }

}
