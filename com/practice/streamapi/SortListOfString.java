package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class SortListOfString {
    public static void main(String[] args) {

        //Given List
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "Eve", "David");

        //Solution
        List<String> sorted = names.stream()
                .sorted()
                .toList();
        System.out.println("sorted given string: "+sorted);
    }
}
