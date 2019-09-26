package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;

public class TestFizzBuzz {

    @Test
    public void whenMultipleOf3ReturnFizz() {

        //ARRANGE
        int number = 3;

        //ACT
        String result = FizzBuzz.fizzBuzzCheck(3);

        //ASSERT
        Assertions.assertThat(result).isEqualToIgnoringCase("fizz");

    }

    @Test
    public void whenMultipleOf5ReturnBuzz() {

        //ARRANGE
        int number = 5;

        //ACT
        String result = FizzBuzz.fizzBuzzCheck(5);

        //ASSERT
        Assertions.assertThat(result).isEqualToIgnoringCase("buzz");

    }

    @Test
    public void whenDivisibleBy15ReturnFizzBuzz() {

        //ARRANGE
        int number = 15;

        //ACT
        String result = FizzBuzz.fizzBuzzCheck(15);

        //ASSERT
        Assertions.assertThat(result).isEqualToIgnoringCase("fizzbuzz");

    }

    @Test
    public void whenNotDivisibleBy3Or5ReturnNumber() {

        //ARRANGE
        int number = 16;

        //ACT
        String result = FizzBuzz.fizzBuzzCheck(16);

        //ASSERT
        Assertions.assertThat(result).isEqualToIgnoringCase("16");

    }

    @Test
    public void whenGivenNumbers1To20ReturnAllFizzBuzzResults() {
        //ARRANGE

        int [] numbers = new int[20];

        for(int i=0; i < numbers.length; i++){
            numbers[i] = i;
        }

        //ACT
        String [] result = FizzBuzz.fizzBuzzArray(numbers);

        //ASSERT
        for(int i=0; i < numbers.length; i++) {
            Assertions.assertThat(result[i]).isEqualToIgnoringCase(FizzBuzz.fizzBuzzCheck(i));
        }
    }
}
