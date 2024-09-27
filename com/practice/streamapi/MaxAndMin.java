package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {

        //Given List
        List<Integer> numbers = Arrays.asList(15, 22, 84, 13, 9, 30);

        //Solution
        List<Integer> maxNum = numbers.stream()
                .max(Integer::compareTo)
                .stream().toList();
        System.out.println("Max number from the list: "+maxNum);

        List<Integer> minNum = numbers.stream()
                .min(Integer::compareTo)
                .stream().toList();
        System.out.println("Min number from the list: "+minNum);
    }
}
