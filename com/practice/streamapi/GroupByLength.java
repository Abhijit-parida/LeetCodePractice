package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {

        //Given List
        List<String> words = Arrays.asList("apple", "banana", "pear", "kiwi", "grape", "melon");

        //Solution
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouping String By length: "+ groupedByLength);

        String groupedBy = words.stream()
                .collect(Collectors.groupingBy(String::length))
                .toString();
        System.out.println("Grouping String By length: "+ groupedBy);
    }
}
