package com.manchesterdigital;

public class Variables {
    static boolean isHungry = false; //class level variable. Only created once because of static keyword.
    //static int counter = 0; //poor practice - will run out of deadlock eventually.

    public static void main(String[] args) {
        greetWhenAdult(12);
    }

    /**
     * Greets based on age.
     *
     * @param age this is the age required.
     */

    private static void greetWhenAdult(int age) { //age parameter eg
        boolean isHappy = true; //local variable eg, not accessible in main.

        if (!isHungry) {
            if (isHappy && age >= 18) {
                System.out.println("Hello");
            }
        }
    }
}
//end of class
