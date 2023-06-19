package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(13, 24, 56, 78, 90);

        Optional<Integer> maxElement = numbers.stream().max(Integer::compareTo);

        if (maxElement.isPresent()) {
            System.out.println("Maximum value: " + maxElement.get());
        } else {
            System.out.println("The list is empty.");
        }
    }
}

