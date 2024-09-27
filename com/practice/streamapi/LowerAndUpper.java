package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerAndUpper {
    public static void main(String[] args) {

        //Given List
        List<String> input = Arrays.asList("jAvA", "sTreAm", "pRacTIcE");

        //Solution
        List<String> upperCase = input.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("uppercase: "+ upperCase);

        List<String> lowerCase = input.stream()
                .map(String::toLowerCase)
                .toList();
        System.out.println("lowercase: "+ lowerCase);
    }
}
