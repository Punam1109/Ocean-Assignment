package com.cg.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 43, 101, 243, 149, 900, 320);

        List<Integer> result = numbers.stream()
                .filter(number -> String.valueOf(number).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
