package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSetTest {

    @Test
    public void whenEmptySetEnteredReturnListOfEmptySet() {
        //ARRANGE
        List<Integer> input = List.of();
        Set<Set<Integer>> expected = new HashSet();
        expected.add(new HashSet());

        //ACT
        Set<Set<Integer>> result = PowerSet.powerSet(input);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenSingleElementSetEnteredReturnListOfEmptySetAndSameSet() {
        //ARRANGE
        List<Integer> input = List.of(1);
        Set<Set<Integer>> expected = new HashSet();
        expected.add(new HashSet());
        expected.add(Collections.singleton(1));

        //ACT
        Set<Set<Integer>> result = PowerSet.powerSet(input);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenTwoElementSetEnteredReturnPowerSet() {
        //ARRANGE
        List<Integer> input = List.of(1, 2, 3);
        Set<Set<Integer>> expected = new HashSet<>();
        expected.add(new HashSet());
        expected.add(Collections.singleton(1));
        expected.add(Collections.singleton(2));
        expected.add(Collections.singleton(3));
        expected.add(new HashSet<>(List.of(1,2)));
        expected.add(new HashSet<>(List.of(2,3)));
        expected.add(new HashSet<>(List.of(1,3)));
        expected.add(new HashSet<>(input));

        //ACT
        Set<Set<Integer>> result = PowerSet.powerSet(input);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(expected);

    }

}
