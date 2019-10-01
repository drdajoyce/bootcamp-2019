package com.manchesterdigital;

public class ForLoopExample {
    public static void main(String[] args) {

        /**
         * for (initialisation (specify data type); boolean expression; update statement){
         * //one or more lines of logic
         * }
         */

        for (int i = 0; i <= 100; i++){
            System.out.println("i => " + i);
        } //i is a local variable for this block.

        int x = 0;
        for (x = 0; x <= 100; x++){
            System.out.println("x => " + x);
        }

        System.out.println("x = " + x);

        //infinite loop eg
//        for (;;){
//            System.out.println("Wohooo");
//        }



    }
}
