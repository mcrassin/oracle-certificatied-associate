package com.oca.methodsAndEncapsulation.statics;

/**
 * Static & instances initialization blocks + constructor + inline.
 *
 * Notes:
 * initialization block order ? mixup with inline ? => appearance in the class.
 * if an init block appear before declaration of the variable (and inline init) int the class:
 *  the var can be used in the init block,
 *  but the var is not init, so operation that require init var can't be done (like ++), even if init is done few lines after.
 *
 * STATIC INIT:
 * 1/ static init block     count=4
 * 2/ inline count init     count=0
 * 3/ static init block 2   count++ => count=1
 *
 * INSTANCE INIT:
 * 4/ instance init block   count++ => count=2, instCount=5
 * 5/ inline instance init  ++count => count=3, instCount=3
 * 6/ instance init block 2 count++ => count=4, instCount=4
 * 7/ constructor           count++ => count=5, instCount=5
 *
 * INSTANCE INIT:
 * 4/ instance init block   count++ => count=6, instCount=5
 * 5/ inline instance init  ++count => count=7, instCount=7
 * 6/ instance init block 2 count++ => count=8, instCount=8
 * 7/ constructor           count++ => count=9, instCount=9
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class StaticAndInstanceInitializers {
    static {
        System.out.println("STATIC INIT:");
        System.out.println("1/ static init block");
        count = 4;
    }

    {
        System.out.println("4/ instance init block");
        count++;
        instCount = 5; // 1st instance init.
    }

    int instCount = ++count; // 2nd instance init. => override 1st init.

    // inline init of count is done between first and second static init blocks.
    static int count = 0;
    static {
        System.out.println("3/ static init block 2");
        count++;
    }

    {
        System.out.println("6/ instance init block 2");
        count++;
        instCount++; // 3rd instance init.
    }

    StaticAndInstanceInitializers() {
        System.out.println("7/ constructor");
        count++;
        instCount++; // last instance init.
    }

    public static void main(String[] args) {
        System.out.println("count = " + StaticAndInstanceInitializers.count + " (after static init. only)");
        System.out.println("INSTANCE INIT:");
        StaticAndInstanceInitializers inst1 = new StaticAndInstanceInitializers();
        System.out.println("count=" + count + " & instCount=" + inst1.instCount + " (after static & instance init.)");
        System.out.println();

        System.out.println("INSTANCE INIT (2nd time):");
        StaticAndInstanceInitializers inst2 = new StaticAndInstanceInitializers();
        System.out.println("count=" + count + " & instCount=" + inst2.instCount + " (after static & instance init.)");
    }

}
