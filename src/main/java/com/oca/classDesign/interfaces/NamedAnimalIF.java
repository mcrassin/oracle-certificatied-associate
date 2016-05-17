package com.oca.classDesign.interfaces;

/**
 * @author mcrassin
 * @since 17/05/2016
 */
public interface NamedAnimalIF {
    /**
     * Static
     */

    /*public static*/ int animalNumber = 6;
    //static {} // DOES NOT COMPILE, not allowed in interface.

    static void printDetails(NamedAnimalIF animalIF) {
        System.out.println("I'm an animal, my name is " + animalIF.getName() + ".");
    }

    /**
     * NON static
     */

    /*public*/ String getName();

    /*public*/ default int getWeight() {
        return 20;
    }

}
