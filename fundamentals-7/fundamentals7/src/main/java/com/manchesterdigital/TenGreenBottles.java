package com.manchesterdigital;

import java.util.ArrayList;

public class TenGreenBottles {

    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("TEN");
        numbers.add("NINE");
        numbers.add("EIGHT");
        numbers.add("SEVEN");
        numbers.add("SIX");
        numbers.add("FIVE");
        numbers.add("FOUR");
        numbers.add("THREE");
        numbers.add("TWO");
        numbers.add("ONE");
        numbers.add("NO");

        for (int i = 0; i < 10 ; i++) {

            verse(numbers.get(i), numbers.get(i+1));
        }

    }

    private static void verse(String number, String numMinusOne){

        //String numMinusOne;

        System.out.println(number + " GREEN BOTTLES HANGING ON THE WALL");
        System.out.println(number + " GREEN BOTTLES HANGING ON THE WALL");
        System.out.println("AND IF ONE GREEN BOTTLE SHOULD ACCIDENTALLY FALL");
        System.out.println("THERE'LL BE " + numMinusOne + " GREEN BOTTLES HANGING ON THE WALL");
    }
}
