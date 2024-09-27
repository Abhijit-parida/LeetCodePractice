package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class GetDistinctElement {
    public static void main(String[] args) {

        //Given List
        List<Integer> numbers = Arrays.asList(2, 5, 2, 6, 8, 9, 8, 6, 10, 5);

        //Solution
        List<Integer> distinctElement = numbers.stream()
                .distinct()
                .toList();
        System.out.println("After Remove duplicate: "+distinctElement);
    }
}
