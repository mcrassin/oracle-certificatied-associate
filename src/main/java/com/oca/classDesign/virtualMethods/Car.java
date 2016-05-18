package com.oca.classDesign.virtualMethods;

/**
 * @author mcrassin
 * @since 18/05/2016
 */
public class Car {
    public String getBrand() {
        return "unknown";
    }
    public String getModel() {
        return "unknown";
    }

    public void displayInformation() {
        System.out.println("car - brand:" + getBrand() + ", model:" + getModel());
    }
}
