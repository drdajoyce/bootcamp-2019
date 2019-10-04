package com.manchesterdigital;
public class FizzBuzz {
    public static String fizzBuzzer(int number) {
        StringBuilder result = new StringBuilder();
        if (number % 3 == 0) {
            result.append("Fizz");
        }
        else if ((number % 5 == 0)){
            result.append("Buzz");
        }
        else{
            result.append(number);
        }
        String stringResult = result.toString();
        if (stringResult.contains("3")){
            stringResult= "Fizz";
        } else if (stringResult.contains("5")){
            stringResult = "Buzz";
        }
        return stringResult;
    }
}
