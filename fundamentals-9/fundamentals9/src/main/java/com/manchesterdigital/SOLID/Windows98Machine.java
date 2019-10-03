package com.manchesterdigital.SOLID;

import com.manchesterdigital.SOLID.Keyboard;
import com.manchesterdigital.SOLID.Monitor;

public class Windows98Machine {
    private final Keyboard keyboard;
    private final Monitor monitor; //don't do this

//    public Windows98Machine(){
//        standardKeyboard = new StandardKeyboard();
//        monitor = new Monitor();
//
//        /*this couples the Windows Machine to the Keyboard & Monitor. Constructor has no parameters, so have no
//        opportunity to change them.
//         */
//
//    }


    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    } //this is dependency inversion.
}
