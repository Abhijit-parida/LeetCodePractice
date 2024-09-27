package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumbersIntoOddEven {
    public static void main(String[] args) {

        // Given List
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Solution
        Map<Boolean, List<Integer>> collect = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Partition num into Odd and Even: "+ collect);
    }
}
