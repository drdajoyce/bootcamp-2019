package com.manchesterdigital;

public class Toyota extends Vehicle implements Movement {
    public Toyota(String colour, Integer numberOfSeats, TransmissionType transmissionType, Double engineSize,
                  String manufacturer) {
        super(colour, numberOfSeats, transmissionType, engineSize, manufacturer);
    }

    @Override
    public void moveForwards() {
        System.out.println("Moving Toyota forwards");
    }

    @Override
    public void reverse() {
        System.out.println("Reversing Toyota");
    }
}
