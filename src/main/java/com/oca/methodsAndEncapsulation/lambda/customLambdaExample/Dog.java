package com.oca.methodsAndEncapsulation.lambda.customLambdaExample;

/**
 * @author mcrassin
 * @since 16/05/2016
 */
public class Dog {
    String name;
    boolean swimmer;

    public Dog(String name, boolean canSwim) {
        this.name = name;
        this.swimmer = canSwim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSwimmer() {
        return swimmer;
    }

    public void setSwimmer(boolean swimmer) {
        this.swimmer = swimmer;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
