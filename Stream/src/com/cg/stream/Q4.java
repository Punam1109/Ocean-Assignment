package com.cg.stream;
import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(96, 54, 30, 39, 11);

        long count = numbers.stream().count();

        System.out.println("Total number of elements: " + count);
    }
}
