package com.manchesterdigital;

public class WhileExample {

    public static void main(String[] args) {
        /**
         * while (boolean expression){
         * //body/logic
         * }
         */

        double growthRate = 0.04; //4%
        int population = 800; //initial population of puffins.
        int year = 0; //i.e. present time.

        while (population <= 1200){
            Double tempPopulation = population * (1 + growthRate);
            population = tempPopulation.intValue(); //prevents casting
            year++;
        }

        System.out.println("year = " + year);
        System.out.println("population = " + population);

        sumAverage(3);
        sumAverage(100);
        sumAverageLooper();

    }

    private static void sumAverage(int N){
        int i = 1;
        int sum = 0;
        double average =0;
        while (i <= N){
            sum += i;
            average = (double) sum /i;
            i++;
        }

        System.out.println("Sum is " + sum + " and average is " + average);
    }

    private static void sumAverageLooper(){
        for (int i = 1; i <= 100 ; i++) {
            sumAverage(i);
        }
    }


}
