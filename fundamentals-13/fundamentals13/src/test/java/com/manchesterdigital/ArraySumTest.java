package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class ArraySumTest {

    @Test
    public void whenSingleArrayGivenReturnSumOfElements() {
        //ARRANGE
        List<List<Integer>> array = List.of(List.of(1, 2, 3));

        //ACT
        int result = ArraySum.arrayListSum(array);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    public void whenArrayOfArraysGivenReturnSumOfElements() {
        //ARRANGE
        List<List<Integer>> array = List.of(List.of(1, 2, 3), List.of(1, 2, 3));

        //ACT
        int result = ArraySum.arrayListSum(array);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(12);
    }

    @Test
    public void whenArrayOfThreeArraysGivenReturnSumOfElements() {
        //ARRANGE
        List<List<Integer>> array = List.of(List.of(1, 2, 3), List.of(1, 2, 3), List.of(1, 2, 3, 4));

        //ACT
        int result = ArraySum.arrayListSum(array);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(22);
    }

    @Test
    public void whenEmptyArrayIncludedItDoesNotContributeToSum() {
        //ARRANGE
        List<List<Integer>> array = List.of(List.of(), List.of(1, 2, 3), List.of(1, 2, 3, 4));

        //ACT
        int result = ArraySum.arrayListSum(array);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(16);
    }



}//end of class
