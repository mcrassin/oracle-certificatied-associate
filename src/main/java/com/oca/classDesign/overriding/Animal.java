package com.oca.classDesign.overriding;

/**
 * @author mcrassin
 * @since 14/05/2016
 */
public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void walk() {
        System.out.println("walking");
    }

    private void run(int miles) {
        System.out.println("no thanks");
    }

    public Object jump(int numberOfJumpToDo) {
        System.out.println("jumping " + numberOfJumpToDo + " times.");
        return new Object();
    }

    public void tryToFoundACarrot() throws ClassNotFoundException {
        throw new ClassNotFoundException("i do not care about carrot.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void print(Animal animal) {
        System.out.println(animal);
    }

    public static void main(String[] args) {
        Animal a = new Animal("jean");
        System.out.println(a);
        a.run(3);
    }
}
