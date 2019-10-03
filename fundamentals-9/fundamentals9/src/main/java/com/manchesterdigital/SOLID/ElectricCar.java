package com.manchesterdigital.SOLID;

public class ElectricCar implements MoveVehicle {
    private Engine engine;

//    @Override
//    public void startEngine() {
//        throw new UnsupportedOperationException("I'm engine-less");
//    } //breaks Liskov substitution when we implement from Car!

    @Override
    public void accelerate() {
        engine.powerOn(3000);
    }
}
