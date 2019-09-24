package com.manchesterdigital;

import static com.manchesterdigital.BakingExample.switchOvenOn;

public class Scratch {
    public static void main(String[] args) {
        BakingExample bakingExample = new BakingExample();
        bakingExample.decorate(); //decorate is not static so belongs to the object itself. BakingExample wouldn't have
        // access

        switchOvenOn(5); //hovering over, using the lightbulb & doing add static import gets this.
    }
}
