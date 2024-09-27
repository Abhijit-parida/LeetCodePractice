package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class SquareOfEvenNum {
    public static void main(String[] args) {

        //Given List
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        //Solution
        List<Integer> result = numbers.stream()
                .filter(n-> n%2 == 0)
                .map(n -> n*n)
                .toList();

        System.out.print("Square of Even Numbers: "+ result);
    }
}
