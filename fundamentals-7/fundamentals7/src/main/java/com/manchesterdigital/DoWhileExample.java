package com.manchesterdigital;

public class DoWhileExample {

    public static void main(String[] args) {
        /**
         * do{
         *      //body/logic
         *      } while (boolean expression);
         */

        boolean isLying = false;

        do {
            System.out.println("Can't wait for today to finish");
        } while (isLying);


        //do while challenge
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while(i <= 7); // do while challenge.


        fibonacciChallenge(1000);
        factorialChallenge(10000);
    }

    private static void fibonacciChallenge(int limit){
        int a = 0;
        int b = 1;
        int c = 1;

        System.out.println(a);

        do{
            System.out.println(c);
            c = a + b;
//            if (c > limit){
//                break;
//            }
            a = b;
            b = c;


        }while (c <= limit);
    }

    private static void factorialChallenge(int limit){
        int f = 1;
        int i = 1;
        do {
            System.out.println(f);
            f *= i;

            i++;


        } while(f <= limit);
    }


}
