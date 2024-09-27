package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringDelimiter {
    public static void main(String[] args) {

        //Given List
        List<String> items = Arrays.asList("Milk", "Bread", "Butter", "Eggs");

        //Solution
        String result1 = items.stream()
                .collect(Collectors.joining("-> "));
        System.out.println("join by using delimiter: "+ result1);

        // Using String class
        String result2 = String.join(", ", items);
        System.out.println("join by using delimiter: "+ result2);
    }
}
