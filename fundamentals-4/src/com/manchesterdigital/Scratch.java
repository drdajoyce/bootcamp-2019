package com.manchesterdigital;

import static com.manchesterdigital.BakingExample.switchOvenOn;

public class Scratch {
    public static void main(String[] args) {
        BakingExample bakingExample = new BakingExample();
        bakingExample.decorate(); //decorate is not static so belongs to the object itself. BakingExample wouldn't have
        // access

        switchOvenOn(5); //hovering over, using the lightbulb & doing add static import gets this.

        int [] numbers; //preferred
        int numbers2 [];

        int [] numbers3 = new int[10]; //initialises every element to the int default (0).

        numbers3[0] = 99;
        numbers3[4] = 77;

        int [] lotteryNumbers = {12, 45, 55, 66, 77};
        System.out.println(lotteryNumbers[4]); //77
        System.out.println(lotteryNumbers[9]); //ArrayOutOfBoundsException.
    }
}
