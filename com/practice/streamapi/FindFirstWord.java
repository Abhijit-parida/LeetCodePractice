package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstWord {
    public static void main(String[] args) {

        //Given List
        List<String> input = Arrays.asList("apple", "mango", "ant", "umbrella", "bad", "perform");

        //Solution
        List<String> firstWord = input.stream()
                .filter(f -> f.startsWith("a"))
                .toList();
        System.out.println("Word Starts with 'a': "+ firstWord);
    }
}
