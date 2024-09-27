package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageListNumbers {
    public static void main(String[] args) {

        // Give List
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Solution
        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("Average List Number from the List"+ average);
    }
}
