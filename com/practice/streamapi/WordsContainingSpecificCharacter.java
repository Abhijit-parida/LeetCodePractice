package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class WordsContainingSpecificCharacter {
    public static void main(String[] args) {

        // Given List
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        // Solution
        List<String> contains = words.stream()
                .filter(w -> w.contains("e"))
                .toList();
        System.out.println(contains);
    }
}
