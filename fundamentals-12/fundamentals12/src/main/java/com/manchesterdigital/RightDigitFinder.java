package com.manchesterdigital;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigitFinder {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 22, 93);
        List<Integer> numbers2 = List.of(16, 8, 886);

        System.out.println(rightDigit(numbers));
        System.out.println(rightDigit(numbers2));


    }

    private static List<Integer> rightDigit(List<Integer> nums){
        return nums.stream().map(i -> i % 10).collect(Collectors.toList());
    }


}
