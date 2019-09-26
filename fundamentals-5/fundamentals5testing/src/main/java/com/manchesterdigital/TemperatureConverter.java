package com.manchesterdigital;

public class TemperatureConverter {

    public static final String CELCIUS_UNIT = "C";
    public static final String FAHRENHEIT_UNIT = "F";

    public static double convert(String unitToConvertTo, int temperature) {

        if(!unitToConvertTo.equalsIgnoreCase(CELCIUS_UNIT) &&
                !unitToConvertTo.equalsIgnoreCase(FAHRENHEIT_UNIT)) {
            throw new InvalidConversionUnitException("Provided invalid unit: " + unitToConvertTo);
        }

        if(unitToConvertTo.equalsIgnoreCase(CELCIUS_UNIT)){
            return calculateFahrenheitToCelcius(temperature);
        }
        return calculateCelciusToFahrenheit(temperature);
    }

    private static double calculateFahrenheitToCelcius(int fahrenheitValue){
        return Math.ceil((fahrenheitValue - 32) * 5 / 9);
    }

    private static double calculateCelciusToFahrenheit(int celciusValue){
        return (celciusValue * 9/5) + 32;
    }
}
