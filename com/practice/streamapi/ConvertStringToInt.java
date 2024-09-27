package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class ConvertStringToInt {
    public static void main(String[] args) {

        //Given List
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");

        //Solution
        List<Integer> convertInt = numbers.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println("Converted into int: "+ convertInt);
    }
}
