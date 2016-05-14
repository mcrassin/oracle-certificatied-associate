package com.oca.methodsAndEncapsulation.overriding;

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

    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                "}";
    }

    public static void main(String[] args) {
        Animal cat = new Animal("william");
        System.out.println(cat);
        cat.jump(2);
        System.out.println();

        Animal rabbit = new Rabbit("jeannot");
        System.out.println(rabbit);
        rabbit.jump(5);
    }
}
