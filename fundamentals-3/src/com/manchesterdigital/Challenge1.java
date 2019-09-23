package com.manchesterdigital;

public class Challenge1 {

    public static void main(String[] args) {
        double val = 20;
        double another = 80;
        double result1 = (val + another) * 25;
        double result2 = result1 % 40;

        if(result2 <= 20){
            System.out.println("Total was over the limit");
        }
    }
}
