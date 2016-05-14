package com.oca.methodsAndEncapsulation.overriding;

/**
 * Do overriding toString method, method signature are exactly the same.
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class Dog extends Animal {

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
        Animal a = new Dog("jean");
        System.out.println(a); // use the overloaded method of toString.
        //a.run(3);   // no run method inherited, private methods are not inherited.
    }

}
