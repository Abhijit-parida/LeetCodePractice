package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class SumOfInt {
    public static void main(String[] args) {

        //Given List
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //Solution
        int allSum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("All num sum of: "+allSum);

        int evenSum = numbers.stream()
                .filter(e -> e%2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Even num sum of: "+ evenSum);

        int oddSum = numbers.stream()
                .filter(o -> o%2 == 1)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Odd num sum of: "+ oddSum);
    }
}
