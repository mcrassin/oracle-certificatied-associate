package com.oca.classDesign.virtualMethods;

/**
 * Show what virtual methods are:
 *  every non-static, non-final and non-private methods.
 *  because those methods can be overridden at runtime.
 *
 * @author mcrassin
 * @since 18/05/2016
 */
public class PeugeotCar extends Car {

    public String getBrand() {
        return "Peugeot";
    }

    public String getModel() {
        return "206";
    }

    public static void main(String[] args) {
        /*
            A specifity of Java is that: if a child class extends a parent class, overriding some methods,
                then even if parent is calling a method, the overridden method will be use.
            For instance: getBrand() & getModel() are overridden in PeugeotCar.
                When car.displayInformation() calls those methods, we get the overridden versions returning: 'Peugeot' & '206'.
                And not the original versions 'unknown' & 'unknown'.
         */
        Car car = new PeugeotCar();
        car.displayInformation();
    }

}
