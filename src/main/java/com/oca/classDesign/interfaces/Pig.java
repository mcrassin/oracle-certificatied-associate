package com.oca.classDesign.interfaces;

import com.oca.classDesign.overriding.Animal;

/**
 * Show interfaces:
 *  - conflict method name 'getName'
 *  - conflict static variable 'animalNumber'
 *  - static method 'printDetails', not inherited
 *  - new default method 'getAge'
 *  - conflict with default methods inherited 'getWeight'
 *
 * @author mcrassin
 * @since 17/05/2016
 */
public class Pig extends Animal implements NamedAnimalIF, AnimalDescriptionIF {
    public Pig(String name) {
        super(name);
    }

    public String getName() {
//        return name;          // DOES NOT COMPILE, name' access modifier is default & we're not in the same package
        return super.getName(); // works, getName method is protected.
    }

    /**
     * Override default implementation from:
     *  - NamedAnimalIF.getWeight
     *  - AnimalDescriptionIF.getWeight
     *
     * Note: if default methods are not overridden, class would not compile
     *  as there is a conflict between the 2 default methods!
     *
     * @return
     */
    public int getWeight() {
        return 100;
    }

    public static void main(String[] args) {
        Pig pig = new Pig("ruddy");

        //System.out.println(pig.animalNumber);   // DOES NOT COMPILE, ambiguous reference to both interfaces.
        System.out.println(AnimalDescriptionIF.animalNumber);
        System.out.println(NamedAnimalIF.animalNumber);

        NamedAnimalIF.printDetails(pig);// directly calls static method inside interface.
//        pig.printDetails(pig);        // DOES NOT COMPILE, static methods are not inherited and must be referenced from the IF directly.

        System.out.println("pig's age: " + pig.getAge());
        System.out.println("pig's weight: " + pig.getWeight());
    }
}
