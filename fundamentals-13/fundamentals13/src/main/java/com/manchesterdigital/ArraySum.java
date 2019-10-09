package com.manchesterdigital;


import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySum {

    public static int arrayListSum(List<List<Integer>> array) {
        int sum = 0;
        List<Integer> flatArray = array.stream().flatMap(Collection::stream).collect(Collectors.toList());

        for (Integer elements : flatArray) {
            sum += elements;
        }
        return sum;
    }

//    public static int singleArraySum(int[] array) {
//        int sum = 0;
//        for (int arrays : array){
//            sum += arrays;
//        }
//
//        return sum;
//
//    }
//
//    public static int arraySum(int[][] array) {
//        int sum = 0;
//        for (int[] arrays : array){
//            sum += singleArraySum(arrays);
//        }
//        return sum;
//    }
}

