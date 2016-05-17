package com.oca.classDesign.overriding;

/**
 * Show variable 'name' hiding.
 * Private methods are not inherited.
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class Dog extends Animal {
    /**
     * Variable hiding and NOT overriding.
     */
    private String name;


    public Dog(String name) {
        super(name);
    }

    /**
     * Overriding Animal toString method.
     */
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("The Animal constructor is using animal.name");
        Animal a = new Dog("jean");

        System.out.println("As we override toString method, the method is using dog.name");
        System.out.println("Thus, dog.name is never init (by the constructor), that's why 'jean' is not displayed:");
        System.out.println(a); // use the overloaded method of toString.
        //a.run(3);   // no run method inherited, private methods are not inherited.
    }

}
