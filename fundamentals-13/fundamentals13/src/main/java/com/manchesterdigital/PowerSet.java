package com.manchesterdigital;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PowerSet {

    public static void main(String[] args) {

    }

    public static Set<Set<Integer>> powerSet(List<Integer> input) {
        Set<Set<Integer>> result = new HashSet();
        result.add(new HashSet());

        for (Integer i : input) {
            Set<Set<Integer>> temp = new HashSet();

            for (Set<Integer> intSet : result) {
                intSet = new HashSet(intSet);
                intSet.add(i);
                temp.add(intSet);
            }
            result.addAll(temp);
        }
        return result;
    }

}

