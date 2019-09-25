package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test //the block of this is a unit test
    public void whenFahrenheitIsZeroThenCelciusIsMinus17() {
        //ARRANGE
        String unitToConvertTo = "C";
        int temperature = 0;

        //ACT
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(-17.0);

    }

    @Test
    public void whenFahrenheitIs100ThenCelciusIs38() {
        //ARRANGE
        String unitToConvertTo = "C";
        int temperature = 100;

        //ACT
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        //ASSERT
        Assertions.assertThat(result).isEqualTo(38.0);
    }
}
