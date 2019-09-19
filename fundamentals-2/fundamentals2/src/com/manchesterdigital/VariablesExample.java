package com.manchesterdigital;

import java.util.Arrays;
import java.util.Date;

/**
 * Exploring data types and variables.
 *
 * Use camel case to name variables - starting variables with upper case is bad practice.
 * Covers int, long, boolean
 *
 * @author Duncan Joyce.
 */

public class VariablesExample {

    public static void main(String[] args) {
        //PRIMATIVES


        int Number; //Bad practice
        int numberOfAnimals= 10; //good practice

        System.out.println("Number of animals is: " +numberOfAnimals);

        int i1, i2, i3; //bad practice

        /*
        This declares 3 variables as integers but only assigns d3 as 3.
        The others are not initialised.
         */

        int d1, d2, d3=3;

        long diameterOfSunInMiles = 12L;

        int miles = 1_000_000; //underscores just for readability.

        boolean itsRaining = true;

        System.out.println("Raining? " + itsRaining);

        float pie = (float) 3.14; //results post-casting what IntelliJ recognised as a doulbe to a float, BAD.
        double percentage = 49.5d;

        char initial = 'D';

        //NON-PRIMATIVE

        String firstName = "Duncan";
        String lastName = "Joyce";
        /*
        This creates 4 strings: firstName, an anonymous one, lastName and the whole string "Duncan Joyce".
         */
        System.out.println("Name: " + firstName + " " + lastName);

        System.out.printf("Name: %s %s", firstName, lastName);

        String.format("Name: %s %s", firstName, lastName);

        System.out.println(String.format("Name: %s %s", firstName, lastName));

        StringBuilder output = new StringBuilder();

        output.append(firstName);
        output.append(" ");
        output.append(lastName);

        //alternatively, this does it all at once.

        output.append(firstName).append(" ").append(lastName); //just be careful not to go over the grey line!

        System.out.println(output.toString());

        int [] numbers = new int[10]; //not great

        numbers[0] = 99;

        int [] lotteryNumbers = { 23, 45, 66 }; //this array will permanently only be able to take 3 elements.
        //lotteryNumbers[6] = 88; creates an error.

        System.out.println(numbers[0]); //prints 99.

        //System.out.println(lotteryNumbers[6]); will produce an out of bounds error.

        System.out.println(Arrays.toString(numbers));

        String [] names = {"John", "Doe", "Mike"};

        Date today = new Date();
        System.out.println(today.toString());

        Integer numberOfStudents = null;

        System.out.println(Integer.MAX_VALUE);

        Boolean myBolean = Boolean.FALSE;



        hello();

    }

    /**
     * This is my hello method.
     *
     * @deprecated because it is poor. Use {@link CodingStandards}.
     */
    @Deprecated
    private static void hello(){
        System.out.println("Hello");
    }
}
