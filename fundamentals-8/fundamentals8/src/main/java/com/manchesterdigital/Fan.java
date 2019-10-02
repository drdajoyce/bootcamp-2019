package com.manchesterdigital;

public class Fan implements Controls {
    @Override
    public void switchOn() {
        System.out.println("Turning dial... switched on");
    }

    @Override
    public void switchOff() {
        System.out.println("Turning dial... switched off");

    }
}
