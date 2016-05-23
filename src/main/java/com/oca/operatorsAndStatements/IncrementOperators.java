package com.oca.operatorsAndStatements;

/**
 * @author mcrassin
 * @since 22/05/2016
 */
public class IncrementOperators {

    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        //         2  +  3
        int res = ++i + ++i;
        System.out.println("++i + ++i = " + res + ", i=" + i);

        i = 1;
        System.out.println("i = " + i);
        // after 1st i++, i equals 2. Thus we got:
        //     1  +  2
        res = i++ + i++;
        System.out.println("i++ + i++ = " + res + ", i=" + i);
    }

}
