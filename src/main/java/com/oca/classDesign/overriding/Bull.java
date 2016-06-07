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
//    @Override     // DOES NOT COMPILE, as no method is overridden!
    public String toString(int age) {
        return "Bull{" +
                "name='" + name + '\'' +
                ", age='" + age + "'" +
                "}";
    }

    public void run(int miles) {
        System.out.println("Yeah, bull are not lazy!");
    }

    public static void main(String[] args) {
        Bull a = new Bull("benny");
        System.out.println(a);
        System.out.println(a.toString(5));
        a.print(a);
        a.run(5);

        Animal b = new Bull("Andy");
//        b.run(5); // DOES NOT COMPILE, try to call private Animal.run, and FAILS
    }
}
