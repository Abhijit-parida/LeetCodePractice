package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class EvenAndOdd {
    public static void main(String[] args) {

        //Given List
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //Solution
        List<Integer> evenNum = input.stream()
                .filter(e -> e%2 == 0)
                .toList();
        System.out.println("Even Num: "+ evenNum);

        List<Integer> oddNum = input.stream()
                .filter(o-> o%2 != 0)
                .toList();
        System.out.println("Odd num: "+ oddNum);
    }
}
