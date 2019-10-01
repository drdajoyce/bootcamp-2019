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


        //Challenge 7: factorial example
//        int f = 1;
//        int i = 1;
//        do {
//            f *= i;
//            System.out.println(f);
//            i++;
//
//
//        } while(f <= 100000); //Challenge 7 factorial example


        //Challenge 4 fibonacci.
        int a = 0;
        int b = 1;
        int c; //c is 1

        System.out.println(a);
        System.out.println(b);
        do{
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;


        }while (c <= 100 ); //Challenge 4 fibonacci.

    }


}
