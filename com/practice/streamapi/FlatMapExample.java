package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {

        // Given List
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9));

        // Solution
        List<Integer> result = numbers.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("Flat Map result: "+ result);
    }
}
