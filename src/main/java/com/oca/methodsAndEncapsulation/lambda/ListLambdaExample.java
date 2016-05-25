package com.oca.methodsAndEncapsulation.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Show some valid lambda.
 * Rules:
 * -- General:
 *  - if used, type should match
 *
 * -- Arguments:
 *  - 0 arg,  '()' should be there
 *  - 1 arg,  '()' can be omitted
 *  - 2 args, '()' are mandatory
 *  - args type is not mandatory, but everyone or none should be specified.
 *
 * -- Body:
 *  - if {}, return and ';' should be there
 *  - if body is only a single java line, '{}' can be omitted.
 *
 * @author mcrassin
 * @since 16/05/2016
 */
public class ListLambdaExample {
	
	public static void main(String...args) {
		List<String> list = new ArrayList();
		list.add("Jean");
		list.add("Mark");
		list.add("Mat");
		list.add("Arnold");
		list.add("Vincent");
		list.add("Rodrigo");

        System.out.println("names starting with M:");
        List<String> results = list.stream()
                .filter(n -> n.startsWith("M"))         // lambda, with none of the optional parts.
                .collect(Collectors.toList());
        System.out.println(String.join(",", results));

        System.out.println("names starting with V:");
        results = list.stream()
                .filter((String n) -> n.startsWith("V"))    // lambda, with none of the optional parts.
                .collect(Collectors.toList());
        System.out.println(String.join(",", results));

        System.out.println("names starting with R:");
        results = list.stream()
                .filter((String n) -> { return n.startsWith("R");}) // complete lambda expression
//                .filter((String n) -> { n.startsWith("R");}) // DOES NOT COMPILE, missing return
//                .filter((String n) -> {true})   // DOES NOT COMPILE, expected ';'
//                .filter((String n) -> true)     // works
//                .filter(n -> true)              // works
//                .filter(n -> "456")             // DOES NOT COMPILE, bad return type, String cannot be converted to boolean.
                .collect(Collectors.toList());
        System.out.println(String.join(",", results));

        System.out.println("names containing a:");
        results = list.stream()
                .filter(a -> a.contains("a"))
                .collect(Collectors.toList());
        System.out.println(String.join(",", results));
    }
	
}
