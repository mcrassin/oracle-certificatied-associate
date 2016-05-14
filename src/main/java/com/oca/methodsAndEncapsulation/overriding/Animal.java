package com.oca.methodsAndEncapsulation.overriding;

/**
 * @author mcrassin
 * @since 14/05/2016
 */
public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    private void run(int miles) {
        System.out.println("no thanks");
    }

    public Object jump(int numberOfJumpToDo) {
        System.out.println("jumping " + numberOfJumpToDo + " times.");
        return new Object();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Animal a = new Animal("jean");
        System.out.println(a);
        a.run(3);
    }
}
