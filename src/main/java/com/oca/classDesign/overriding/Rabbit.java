package com.oca.classDesign.overriding;

import java.util.concurrent.TimeoutException;

/**
 * @author mcrassin
 * @since 14/05/2016
 */
public class Rabbit extends Animal {

    /**
     * Note: if no constructors were defined, the code would not compile,
     *  because the is no default constructor in the parent,
     *  thus the default constructor inserted here would not be able to call super()
     *
     * @return
     */
    public Rabbit(String name) {
        super(name);
    }

    /**
     * Overriding Animal walk method
     *  even if access modifier is different, as long as it restricting visibility: public > protected.
     */
    public void walk() {
        System.out.println("a rabbit do not walk.");
    }

    /**
     * Method is overriding jump in Animal class
     *  even if return type is not the same: Integer != Object
     *  because return type are covariant !!
     *
     * @param numberOfJumpToDo
     * @return
     */
    public Integer jump(int numberOfJumpToDo) {
        System.out.println("i don't want to jump, thanks.");
        return 0;
    }

    /**
     * Override tryToFoundACarrot method of Animal class
     *  even if child is removing exception declaration => reducing exception thrown is allowed (NOT the opposite).
     *
     * Note: Runtime & Error can be thrown & declare anyway (excluded from the above rule).
     */
    public void tryToFoundACarrot() {
        System.out.println("A rabbit always found carrot.");
    }

    /**
     * If parent print method is set as final, this method would NOT COMPILE
     */
    public static void print(Animal animal) {
        System.out.println("This method HIDE the parent method print, and does not override it.");
    }

    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                "}";
    }

    public static void main(String[] args) {
        Animal cat = new Animal("william");
        System.out.println("1/ " + cat);
        cat.walk();
        cat.jump(2);
        try {
            cat.tryToFoundACarrot();
        } catch (Exception e) {
            System.out.println(e);
        }
        Animal.print(cat);
        System.out.println();

        Animal rabbit = new Rabbit("jeannot");
        System.out.println("2/ " + rabbit);
        rabbit.walk();
        rabbit.jump(5);
        try {
            rabbit.tryToFoundACarrot();
        } catch (Exception e) {
            System.out.println(e);
        }
        Animal.print(rabbit);
        Rabbit.print(rabbit);
    }
}
