package com.oca.methodsAndEncapsulation;

/**
 * Compile and runs with args (from source root):
 *  javac com/oca/methodsAndEncapsulation/MainArgs.java
 *  java com/oca/methodsAndEncapsulation/MainArgs 1 2 3
 *
 * @author mcrassin
 * @since 23/05/2016
 */
public class MainArgs {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("args number: " + args.length);
            System.out.print("args: ");
            for (String param : args) {
                System.out.print(param + " ");
            }
        }
    }
}
