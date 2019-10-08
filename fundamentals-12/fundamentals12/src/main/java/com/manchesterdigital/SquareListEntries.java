package com.manchesterdigital;

import java.util.List;
import java.util.stream.Collectors;

public class SquareListEntries {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> numbers2 = List.of(6, 8, -8);

        System.out.println(square(numbers));
        System.out.println(square(numbers2));
        System.out.println(square(List.of()));
    }


    private static List<Integer> square(List<Integer> nums){
        return nums.stream().map(i -> i * i).collect(Collectors.toList());
    }
}
