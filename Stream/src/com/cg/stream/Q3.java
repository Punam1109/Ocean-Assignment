package com.cg.stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 12, 13, 14, 15);

        Optional<Integer> firstElement = numbers.stream().findFirst();

        if (firstElement.isPresent()) {
            System.out.println("First element: " + firstElement.get());
        } else {
            System.out.println("The list is empty.");
        }
    }
}
