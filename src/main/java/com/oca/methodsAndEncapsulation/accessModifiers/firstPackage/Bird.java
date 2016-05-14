package com.oca.methodsAndEncapsulation.accessModifiers.firstPackage;

/**
 * @author mcrassin
 * @since 14/05/2016
 */
public class Bird {
    private String testPrivate = "floating";
    String testDefault = "floating";
    protected String testProtected = "floating";
    public String testPublic = "floating";

    protected void swim() {
        System.out.println(testPrivate);
    }

}
