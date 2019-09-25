package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestIntroduction {

    //good practice for naming conventions:

//    @Test
//    public void testThatABankAccountTakesAnInputWhenDeposited() {
//
//    } //wordy but not wrong
//
//    @Test
//    public void shouldTakeInputWhenDeposited() {
//
//    }
//
//    //BDD(behavioural driven development) STYLE:
//    @Test
//    public void givenBankAccountWhenInputThenDeposited() {
//
//    }

    @Test
    public void shouldAddTwoNumbers() {
        //ARRANGE (may not be needed)
        int first = 23;
        int second = 23;

        //ACT
        int result = first + second;

        //ASSERT
        assertThat(result).isEqualTo(45);

    }


}
