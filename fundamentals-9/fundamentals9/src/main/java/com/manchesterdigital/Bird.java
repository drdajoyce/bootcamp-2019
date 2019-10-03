package com.manchesterdigital;

public abstract class Bird extends Animal {
    private Integer wingSpan;

//extends enforces creation of a constructor because Animal has one.
    public Bird(Integer age, String gender, Integer weightInLbs, Integer wingSpan) {
        super(age, gender, weightInLbs);

        this.wingSpan = wingSpan;
    }

}
