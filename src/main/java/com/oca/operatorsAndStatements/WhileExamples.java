package com.oca.operatorsAndStatements;

/**
 * Show correct infinite while loops.
 * Note: just one at a time.
 *
 * @author mcrassin
 * @since 25/05/2016
 */
public class WhileExamples {

    public static void main(String[] args) {

//        while (1) {}      // DOES NOT COMPILE, incompatible types integer & boolean.
//        while (true) {};  // DOES NOT COMPILE, unreachable statement ';'

//        while (1 == 1) {}   // works.
        while (true);     // works, even with no body.
    }

}
