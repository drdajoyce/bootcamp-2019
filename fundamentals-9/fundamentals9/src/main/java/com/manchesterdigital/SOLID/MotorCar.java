package com.manchesterdigital.SOLID;

import com.manchesterdigital.SOLID.Engine;
import com.manchesterdigital.SOLID.HasEngine;
import com.manchesterdigital.SOLID.MoveVehicle;

public class MotorCar implements MoveVehicle, HasEngine {
    private Engine engine;

    //constructors, getters, setters...


    @Override
    public void startEngine() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(1000);
    }
}
