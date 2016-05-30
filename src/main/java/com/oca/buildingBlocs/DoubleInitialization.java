package com.oca.buildingBlocs;

import org.junit.Assert;

/**
 * Show allowed initialization of different types variables.
 *
 * Every types:
 *  - any var can be init from character! (even double)
 *
 * Primitives
 *  - can be init from any smaller type
 *
 * Wrapper:
 *  - can be init only by the corresponding primitive notation
 *      Integer -> 45
 *      Long -> 45L
 *      Float -> 45f
 *
 * Default:
 *  45      -> int
 *  45.0    -> double ('d' auto added).
 *
 * @author mcrassin
 * @since 30/05/2016
 */
public class DoubleInitialization {

    public static void main(String[] args) {
        /**
         * byte
         */
        byte b1 = 45;
        byte b2 = 'e';
        System.out.println("'e' as byte=" + b2);

        /**
         * short
         */
        short s1 = 45;
        short s2 = 'e';
        System.out.println("'e' as short=" + s2);

        /**
         * int
         */
        int i1 = 45;
//        int i2 = 45l;     // DOES NOT COMPILE, incompatible types: int and long
//        int i3 = 45.0;    // DOES NOT COMPILE, incompatible types: int and double
        int i4 = 'e';
        System.out.println("'e' as int=" + i4);

        /**
         * long
         *  Notation: l,L
         *  Convert from: byte, short, int
         */
        long l1 = 45;
        long l2 = 45l;
        long l3 = 45L;
//        long l4 = 45.0;   // DOES NOT COMPILE, incompatible types: default=double and long.
//        Long l5 = 45;     // DOES NOT COMPILE, incompatible types: int and Long
        long l6 = 'e';

        /**
         * float
         *  Notation: f,F
         *  Convert from: byte, short, int, long (l)
         */
        float f1 = 45;
        float f2 = 45f;
        float f3 = 45.0f;
        float f4 = 45.0F;
//        float f5 = 45.0;    // DOES NOT COMPILE, default 'd' for double, incompatibles types
        float f6 = 45l;       // autobox: long -> float
        Assert.assertEquals(f1, f6, 0.1);
//    float f7 = 45d;         // DOES NOT COMPILE, incompatibles types: double -> float
        float f8 = 'e';

        methodPrimitive(45, 45);    // primitive directly, letters are not mandatory
        methodWrapper(45f, 45d);    // autoboxing to wrapper, proper notation needed, to avoid double autoboxing (int -> float -> Float)

        /**
         * double
         *  Notation: d,D, xEy, xey
         *  Convert from: byte, short, int, long, float
         */
        double d1 = 12;     // default int
        double d2 = 12.2;   // default d
        double d3 = 12.9d;  // 'd' for double
        double d4 = 12.9D;  // same as d3
        Assert.assertEquals(d3, d4, 0.1);

        double d5 = 12.5f;  // 'f' for float, autoboxed to double
        double d6 = 12.5d;  // same as d5
        Assert.assertEquals(d5, d6, 0.1);

        double d7 = 12e2;   // using exponent notation.
        double d8 = 12E2;   // using exponent notation.
        Assert.assertEquals(d7, d8, 0.1);

        double d9 = 5l;     // autobox: long -> double
//        Double d10 = 5f;  // DOES NOT COMPILE, incompatibles types: float -> Double !!
        double d11 = 'e';

    }

    static void methodPrimitive(float f1, double d1) {

    }

    static void methodWrapper(Float f1, Double d1) {

    }
}
