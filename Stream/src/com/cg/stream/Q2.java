package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2		 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 6, 6, 3, 7, 8, 1, 9, 5);

        List<Integer> duplicates = numbers.stream()
                .filter(i -> numbers.stream().filter(x -> x.equals(i)).count() > 1)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Duplicate elements: " + duplicates);
    }
}
