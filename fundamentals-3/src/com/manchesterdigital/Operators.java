package com.manchesterdigital;

public class Operators {

    public static void main(String[] args) {

        //eg of add operator:
        int result = 1 + 2;
        System.out.println("Result is " + result);

        // subtract:
        result = 3 - 1;
        System.out.println("Result is " + result);

        //multiplication:
        result = 5 * 9;
        System.out.println("Result is " + result);

        //division
        result = 10 / 5;
        System.out.println("Result is " + result);

        //modulo (calculates remainder):
        result = 20 % 10;
        System.out.println("Result is " + result); //outputs 0.

        // increment:
        result = result +1;
        //abbreviated post increment:
        result++;

        //pre-increment:
        ++result;

        //decrement:
        result = result - 1;

        //post decrement;
        result--;

        //pre-decrement;
        --result;

        result = result +3;

        //abbreviated addition operator:
        result += 3;

        result = result -10;

        //abbreviated subtraction operator:
        result -= 10;

        //abbreviated multiplication:
        result *= 20;

        //abbreviated division:
        result /= 20;

        boolean isRainingToday = false;

        int number1 =100;
        int number2 = 200;


        //== is equal, != is not equal.
        if(number1 != number2){
            System.out.println("Same");
        }
        //>= is greater than or equal to, <= is less than or equal to.
        if(number1 < number2){
            System.out.println("Number 2 is bigger");
        }

        if(number1 > number2){
            System.out.println("Number 1 is bigger");
        }

        int degreeScore = 60;
        int overallScore = 100;

        //&& is and.
        if(degreeScore >= 60 && overallScore >= 100){
            System.out.println("Yay");
        }

        if(degreeScore >= 60 || overallScore >= 100){
            System.out.println("Yay");
        }

        //! is the not operator:
        if(!isRainingToday){
            System.out.println("You won't need a jacket today!");
        }

        boolean isAnimal = false;
        if(isAnimal = true){
            System.out.println("I am an animal");
        } //just reassigns isAnimal to true, so will run.

        if (!isAnimal){
            System.out.println("I am an animal");
        }

        //equals method for strings is case sensitive.
        String lastName = "Sousa";
        if (lastName.equals("SOUSA")){
            System.out.println("Surname is Sousa.");
        }

        //ignores the case of the characters.
        if (lastName.equalsIgnoreCase("SOUSA")){
            System.out.println("Surname is Sousa.");
        }

        int numberOfMealsToday = 1;

        //eg of a ternary operator:
        boolean isHungry = numberOfMealsToday == 1 ? true : false; //shorthand for if statement.
    }
}
