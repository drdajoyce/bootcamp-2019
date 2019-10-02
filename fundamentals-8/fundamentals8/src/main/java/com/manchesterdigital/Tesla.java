package com.manchesterdigital;

public class Tesla extends Vehicle implements Movement, IsChargable {
    public Tesla(String colour, Integer numberOfSeats, TransmissionType transmissionType, Double engineSize,
                 String manufacturer) {
        super(colour, numberOfSeats, transmissionType, engineSize, manufacturer);
    }

    @Override
    public void moveForwards() {
        System.out.println("Moving faster... forward");
    }

    @Override
    public void reverse() {
        System.out.println("Reversing...");
    }

    @Override
    public void supercharge() {
        System.out.println("Supercharging");
    }
}
