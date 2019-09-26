package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestCost {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void whenHourIsBetween0And4CostIs300() {
        //ARRANGE
        int time = 0;

        //ACT
        int result = CostCalculator.calculate(time, "Car");

        //ASSERT
        Assertions.assertThat(result).isEqualTo(300);
    }

    @Test
    public void whenHourIsBetween5And9CostIs350() {

        //ARRANGE
        int time = 5;

        //ACT
        int result = CostCalculator.calculate(time, "Car");

        //ASSERT
        Assertions.assertThat(result).isEqualTo(350);
    }

    @Test
    public void whenHourIsBetween10And14CostIs500() {

        //ARRANGE
        int time = 10;

        //ACT
        int result = CostCalculator.calculate(time, "Car");

        //ASSERT
        Assertions.assertThat(result).isEqualTo(500);
    }

    @Test
    public void whenHourIsBetween15And19CostIs700() {

        //ARRANGE
        int time = 15;

        //ACT
        int result = CostCalculator.calculate(time, "Car");

        //ASSERT
        Assertions.assertThat(result).isEqualTo(700);
    }

    @Test
    public void whenHourIsBetween20And23CostIs400() {

        //ARRANGE
        int time = 20;

        //ACT
        int result = CostCalculator.calculate(time, "Car");

        //ASSERT
        Assertions.assertThat(result).isEqualTo(400);
    }

    @Test
    public void whenHourIsGreaterThan23ThenExceptionThrown() {

        expectedException.expect(InvalidTimeException.class);

        int result = CostCalculator.calculate(24, "Car");

        Assertions.assertThat(expectedException).isInstanceOf(InvalidTimeException.class);
    }
}
