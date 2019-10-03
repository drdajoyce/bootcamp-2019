package com.manchesterdigital;

public class Fish extends Animal {

    public Fish(Integer age, String gender, Integer weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        swim();
    }

    public void swim(){
        System.out.println("Swimming...");
    }

}
