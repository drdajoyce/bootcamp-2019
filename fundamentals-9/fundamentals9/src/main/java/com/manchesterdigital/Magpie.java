package com.manchesterdigital;

public class Magpie extends Bird implements Flyable {
    public Magpie(Integer age, String gender, Integer weightInLbs, Integer wingSpan) {
        super(age, gender, weightInLbs, wingSpan);
    }

    @Override //override not strictly needed.
    public void fly() {
        System.out.println("Flying like a bird...");
    }

    @Override
    public void move() {
        System.out.println("I'm flapping...");
    }
}
