package com.oca.methodsAndEncapsulation.lambda.customLambdaExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Showing lambda custom example, create an interface (DogPredicate), and using this to perform custom search
 *  on a dog list.
 *
 * Note: DogPredicate is simple and could be replace by java.util.function.Predicate
 *
 * @author mcrassin
 * @since 16/05/2016
 */
public class LambdaExample {

    public static List<Dog> searchDog(List<Dog> dogs, DogPredicate predicate) {
        List<Dog> results = new ArrayList<>();
        for (Dog aDog : dogs) {
            if (predicate.filterDog(aDog)) {
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

        List<Dog> results = searchDog(dogs, d -> d.isSwimmer());
        results.stream().forEach(d -> System.out.println(d.toString()));
    }

}
