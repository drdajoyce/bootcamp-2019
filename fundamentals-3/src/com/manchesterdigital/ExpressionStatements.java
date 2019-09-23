package com.manchesterdigital;

public class ExpressionStatements {

    public static void main(String[] args) {

        int years = 5;
        double interestRate = 0.4d;
        double amountOfInterest;

        amountOfInterest = interestRate * years;
        System.out.println("interest is " + amountOfInterest);

        double radius = 12.0d;
        double outcome = Math.PI * radius * radius;

        int score = 2000;

        if (score > 1000){
            System.out.println("Score is greater than 1000!");
        }
    }
    }
