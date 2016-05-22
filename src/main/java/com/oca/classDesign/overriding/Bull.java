package com.oca.classDesign.overriding;

/**
 * Do not override toString method because of different params.
 * Bull has access to 'name' with default access modifier.
 *
 * @author mcrassin
 * @since 14/05/2016
 */
public class Bull extends Animal {

    public Bull(String name) {
        super(name);
    }

    /**
     * Not override method !! params are different.
     *
     * @param age
     * @return
     */
    public String toString(int age) {
        return "Bull{" +
                "name='" + name + '\'' +
                ", age='" + age + "'" +
                "}";
    }

    public static void main(String[] args) {
        Bull a = new Bull("benny");
        System.out.println(a);
        System.out.println(a.toString(5));

    }
}
