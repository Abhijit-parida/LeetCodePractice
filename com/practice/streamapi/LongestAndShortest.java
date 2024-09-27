package com.practice.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestAndShortest {
    public static void main(String[] args) {

        //Given List
        List<String> strings = Arrays.asList("apple","banana","kiwi","pineapple");

        //Solution
        List<String> maxString = strings.stream()
                .max(Comparator.comparingInt(String::length))
                .stream().toList();
        System.out.println("longest string: "+maxString);

        List<String> minString = strings.stream()
                .min(Comparator.comparingInt(String::length))
                .stream().toList();
        System.out.print("shortest string: "+ minString);
    }
}
