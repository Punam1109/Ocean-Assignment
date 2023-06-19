package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q6{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(99, 25, 85, 7, 46);

        List<Integer> sortedList = numbers.stream()
                .sorted((a, b) -> Integer.compare(b, a))
                .collect(Collectors.toList());

        System.out.println("Sorted list in descending order: " + sortedList);
    }
}
