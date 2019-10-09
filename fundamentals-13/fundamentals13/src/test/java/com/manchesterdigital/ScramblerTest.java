package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ScramblerTest {

    @Test
    public void whenSameTwoSingleCharacterStringsPassedReturnTrue() {
        //ARRANGE
        String string1 = "a";
        String string2 = "a";

        //ACT
        boolean result = Scrambler.scramble(string1, string2);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void whenTwoDifferentSingleCharacterStringsPassedReturnFalse() {
        //ARRANGE
        String string1 = "a";
        String string2 = "b";

        //ACT
        boolean result = Scrambler.scramble(string1, string2);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(false);
    }

    @Test
    public void whenTwoStringsContainSameLettersReturnTrue() {
        //ARRANGE
        String string1 = "duncan";
        String string2 = "candun";

        //ACT
        boolean result = Scrambler.scramble(string1, string2);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(true);
    }


}//end of class
