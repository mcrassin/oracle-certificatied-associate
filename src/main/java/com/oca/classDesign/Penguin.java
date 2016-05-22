package com.oca.classDesign;

import com.oca.classDesign.overriding.Animal;

/**
 * Penguin inherit from Animal
 *  - Penguin does not have access to 'name' (default access modifier)
 *      because classes are not in the same package
 *  - Penguin has access to 'getName' (protected access modifier)
 *      public & protected properties are inherited
 *
 * @author mcrassin
 * @since 16/05/2016
 */
final public class Penguin extends Animal {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Penguin{" +
//                "name='" + name + '\'' +        // DOES NOT COMPILE
                "name='" + getName() + '\'' +
                "}";
    }
}
