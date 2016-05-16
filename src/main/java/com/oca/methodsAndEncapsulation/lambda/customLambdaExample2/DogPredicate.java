package com.oca.methodsAndEncapsulation.lambda.customLambdaExample2;

import com.oca.methodsAndEncapsulation.lambda.customLambdaExample.Dog;

/**
 * @author mcrassin
 * @since 16/05/2016
 */
public interface DogPredicate {

    boolean filterDog(Dog dog, int position);

}
