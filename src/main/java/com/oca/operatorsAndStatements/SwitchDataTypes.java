package com.oca.operatorsAndStatements;

/**
 * Switch can be used with:
 *
 *  - prior Java 5:
 *  int values
 *  or types that can be promoted to int: byte, short, char
 *  added support for: enum
 *
 *  - Java 7:
 *  String
 *  Primitive wrappers (only in the switch)
 *
 * Rules:
 *  - types shall match
 *  - case expect compile-time constant values - thus case new Integer(45) is not allowed.
 *
 * Switch DOES NOT SUPPORT:
 *  boolean, long, float, double and associated wrapper classes.
 *
 * @author mcrassin
 * @since 22/05/2016
 */
public class SwitchDataTypes {

    public static void main(String[] args) {

        /**
         * Allowed types
         */

        switch ((short) 2) {
            case 2:
                System.out.println("works with short.");
                break;
        }

        switch ('d') {
            case 'd':
                System.out.println("works with char.");
                break;
        }

        switch (45) {
            case 45:
                System.out.println("works with int.");
                break;
        }
        switch (new Integer(45)) {
            case 45:
                System.out.println("works with wrapper Integer.");
                break;
        }

        switch ("Great") {
            case "Great":
                System.out.println("works with String.");
                break;
        }


        /**
         * Rules: type shall match
         */
//        switch ("Great") {
//            case 1: // DOES NOT COMPILE, incompatible types
//                System.out.println("works with String.");
//                break;
//        }

//        switch ("Great") {
//            case '1': // DOES NOT COMPILE, incompatible types
//                System.out.println("works with String.");
//                break;
//        }
    }

}
