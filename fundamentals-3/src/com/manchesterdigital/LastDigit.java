package com.manchesterdigital;

public class LastDigit {

    public static void main(String[] args) {

        lastDigit(33,33);
    }

    public static void lastDigit(int n1, int n2){
        int ld1 = n1 % 10;
        int ld2 = n2 % 10;

        int difference = ld1 - ld2;

        System.out.println(ld1);
        System.out.println(ld2);

        /*if(ld1 == ld2){
            System.out.println("true");
        }

        if(ld1 != ld2){
            System.out.println("false");
        }
         */

        System.out.println("Result: " +(ld1 == ld2));

    }
}
