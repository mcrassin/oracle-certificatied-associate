package com.oca.methodsAndEncapsulation.lambda.customLambdaExample2;

import com.oca.methodsAndEncapsulation.lambda.customLambdaExample.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * Same lambda example as customLambdaExample,
 *  adding one parameter to the predicate, the dog position in the list.
 *
 * @author mcrassin
 * @since 16/05/2016
 */
public class LambdaExample2 {

    public static List<Dog> searchDog(List<Dog> dogs, DogPredicate predicate) {
        List<Dog> results = new ArrayList<>();
        int i=0;
        for (Dog aDog : dogs) {
            if (predicate.filterDog(aDog, i++)) {
                results.add(aDog);
            }
        }

        return results;
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Jean", false));
        dogs.add(new Dog("Mat", true));
        dogs.add(new Dog("Brandon", true));
        dogs.add(new Dog("Jo", false));

        //
        System.out.println("First dog in the list:");
        List<Dog> results = searchDog(dogs, (d, i) -> i == 0);
        results.stream().forEach(d -> System.out.println(d.toString()));

        System.out.println("Last dog in the list:");
        results = searchDog(dogs, (d, i) -> i == dogs.size() - 1);      // using an external variable: allowed.
        results.stream().forEach(d -> System.out.println(d.toString()));

        System.out.println("Complex expression, doing an action (displaying) as well:");
        results = searchDog(
                dogs,
                (d, i) -> {if (i == 0) System.out.println(d.toString()); return i == 0;}
//                d, i -> {if (i == 0) System.out.println(d.toString()); return i == 0;}      // DOES NOT COMPILE, cannot resolve d. parenthesis are mandatory with more than 1 arg.
        );

        System.out.println("Last test:");
        //results = searchDog(dogs, d, i -> i == 4); // DOES NOT COMPILE, parenthesis are mandatory!!

    }

}
