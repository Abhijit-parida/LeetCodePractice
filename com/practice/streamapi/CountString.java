package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class CountString {
    public static void main(String[] args) {

        //Given List
        List<String> words = Arrays.asList("Java", "Python", "Go", "Rust", "C", "JavaScript");

        //Solution
        long countLength = words.size();
        System.out.println("count string: "+countLength);

        List<String> countMoreThan3 = words.stream()
                .filter(c -> c.length() > 3)
                .toList();
        System.out.println("count string length more than 3: "+countMoreThan3);
    }
}
