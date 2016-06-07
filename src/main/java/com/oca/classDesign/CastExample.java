package com.oca.classDesign;

import com.oca.classDesign.overriding.Animal;
import com.oca.classDesign.overriding.Bull;
import com.oca.classDesign.overriding.Rabbit;

/**
 * Show cast between classes of the same branch
 *
 * Animal
 *  - Bull
 *  - Rabbit
 *
 * @author mcrassin
 * @since 07/06/2016
 */
class CharolaisBull extends Bull {
    public CharolaisBull(String name) {
        super(name);
    }
}


public class CastExample {

    public static void main(String[] args) {
        Animal animal = new Animal("jean");

        Bull bull = new Bull("claude");
        CharolaisBull charolais = new CharolaisBull("gégé");
        Rabbit rabbit = new Rabbit("roger");

        // generalize - no cast needed
        Animal a2 = bull;
        Bull b3 = charolais;
        Animal b4 = charolais;

        // specialize - cast needed - risk of ClassCastException.
        Bull b2 = (Bull) animal;    // Throws an ClassCastException

        // transfer between branches
//        Bull b3 = rabbit; // DOES NOT COMPILE
    }

}
