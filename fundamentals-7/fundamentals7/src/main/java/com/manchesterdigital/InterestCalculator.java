package com.manchesterdigital;

public class InterestCalculator {

    public static void main(String[] args) {
        double amount = 100.0d;


        //working out interest for 10, 20, 30, 40, 50 years
//        for (int i = 10; i <= 50 ; i+=10) {
//            System.out.println(calculateInterest(amount, i));
//        }

        int total = 0;

        for (int i = 1; i <= 500; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                    total += i;
                System.out.println(i);
            }
        }
        System.out.println(total);

        System.out.println(stringTimes("Hi",2));
        System.out.println(stringTimes("Hi",4));
    }

    private static String stringTimes(String STR, int N){
        StringBuilder large = new StringBuilder();

        for (int i = 1; i <= N ; i++) {
            large.append(STR);
        }

        return large.toString();
    }


    private static double calculateInterest(double amount, int i) {
        return (amount * i / 100);
    }

    }
