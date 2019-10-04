package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;
public class FizzBuzzTest {
    @Test
    public void whenGiven1Return1() {
        // Arrange
        int number = 1;
        // Act
        String result = FizzBuzz.fizzBuzzer(number);
        // Assert
        Assertions.assertThat(result).isEqualTo("1");
    }
    @Test
    public void whenGiven2Return2() {
        // Arrange
        int number = 2;
        // Act
        String result = FizzBuzz.fizzBuzzer(number);
        // Assert
        Assertions.assertThat(result).isEqualTo("2");
    }
    @Test
    public void whenGiven3ReturnFizz() {
        // Arrange
        int number = 3;
        // Act
        String result = FizzBuzz.fizzBuzzer(number);
        // Assert
        Assertions.assertThat(result).isEqualTo("Fizz");
    }
    @Test
    public void whenGivenMultipleOf3ReturnFizz() {
        // Arrange
        int number = 30;
        // Act
        String result = FizzBuzz.fizzBuzzer(number);
        // Assert
        Assertions.assertThat(result).isEqualTo("Fizz");
    }
    @Test
    public void whenGivenMultipleOf5ReturnBuzz() {
        // Arrange
        int number = 50;
        // Act
        String result = FizzBuzz.fizzBuzzer(number);
        // Assert
        Assertions.assertThat(result).isEqualTo("Buzz");
    }
    @Test
    public void whenGivenNumberContains3ReturnFizz() {
        // Arrange
        int number = 32;
        // Act
        String result = FizzBuzz.fizzBuzzer(number);
        // Assert
        Assertions.assertThat(result).isEqualTo("Fizz");
    }
    @Test
    public void whenGivenNumberContains5ReturnBuzz() {
        // Arrange
        int number = 52;
        // Act
        String result = FizzBuzz.fizzBuzzer(number);
        // Assert
        Assertions.assertThat(result).isEqualTo("Buzz");
    }
}
