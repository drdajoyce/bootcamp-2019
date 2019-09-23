package com.manchesterdigital;

public class IfStatements {

    public static void main(String[] args) {

        /* if (condition){
        //block/body of the IF
        }
         */

        int age = 30;

        if(age <= 29){
            System.out.println("Age is below 30");
        }
        else if(age > 30) {
            System.out.println("Age is over 30");
        }
        else {
            System.out.println("No it isn't");
        }

    }
}
