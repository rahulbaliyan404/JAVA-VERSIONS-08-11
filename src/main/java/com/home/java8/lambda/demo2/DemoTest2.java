package com.home.java8.lambda.demo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoTest2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
        //names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
        //Sort List of Integers
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        Collections.sort(numbers, (a,b) -> a-b);
        System.out.println("Sorted Numbers: " + numbers);
        //Sort Strings by Length
        Collections.sort(names, (a,b) -> a.length() - b.length());
        System.out.println("Sorted Names by Length: " + names);

//
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9,10);
        list.stream().filter(x -> x%2==0).map(x -> x*x)
                .forEach(System.out::println);

    }
}
