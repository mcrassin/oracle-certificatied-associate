package com.oca.methodsAndEncapsulation.overloading;

/**
 * Mixing overloading with varargs & autoboxing (available from Java 1.5)
 *
 * @author mcrassin
 * @since 16/05/2016
 */
public class OverloadingExample {

	public void method(short p1) {
		System.out.println("short");
	}
	public void method(int p1) {
		System.out.println("int");
	}
	/*public int method(int p1) throws Exception { // DOES NOT COMPILE => method is already defined
		System.out.println("int");
        return 0;
    }*/
    /*public static void method(int p1) { // DOES NOT COMPILE => method is already defined
        System.out.println("int");
    }*/
	
	public void method(Integer p1) {
		System.out.println("Integer");
	}
	public void method(int p1, int p2) {
		System.out.println(3);
	}
	
	/**
	 * Second example 
	 */
    public void method2(int...param) {
        System.out.println("varargs");
    }
    /*public void method2(int[]param) { // DOES NOT COMPILE => method is already defined
        System.out.println("tabs");
	}*/
	/*public void method2(int p, int...param) { // COMPILE, but generate ambiguous method calls, when trying example.method2(1, 0, 0), for instance
        System.out.println("1 param + varargs");
    }*/
    public void method2(int p, int p2) {
        System.out.println("2 params");
    }

    /**
     * Third example
     */
    public void method3(String param) {
        System.out.println("String");
    }

    public void method3(Object param) {
        System.out.println("Object");
    }

    public static void main(String args) {
        System.out.println("fake main method! never used!");
    }

    public static void main(String[] args) {
		OverloadingExample example = new OverloadingExample();
		//
        System.out.println("method1:");
        example.method(5);	// calls the int method - 1 is a primitive.
		example.method(new Integer(5));	// calls the Integer method - param is a Wrapper.

        //
        System.out.println("method2:");
        example.method2(1);             // calls varargs.
        example.method2(1, 1);          // calls 2 params method, more accurate than the varargs.
        example.method2(new int[0]);    // allowed, empty tab

        //
        System.out.println("method3:");
        example.method3("test");    // call method3(String)
        example.method3(5);         // autobox primitive to wrapper, and call method3(Object)

    }

}
