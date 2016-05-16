package com.oca.methodsAndEncapsulation.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
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

        System.out.println("names starting with R:");
        results = list.stream()
                .filter((String n) -> { return n.startsWith("R");}) // complete lambda expression
                .collect(Collectors.toList());
        System.out.println(String.join(",", results));

        System.out.println("names containing a:");
        results = list.stream()
                .filter(a -> a.contains("a"))
                .collect(Collectors.toList());
        System.out.println(String.join(",", results));
    }
	
}
