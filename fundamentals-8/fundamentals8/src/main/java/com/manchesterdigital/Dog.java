package com.manchesterdigital;

public class Dog {
    private String breed;
    private Integer tailLength;
    private String eyeColour;
    private Integer age;
    private Integer aggressionLevel; //member variables/fields.
    private DogSize dogSize;
    private Integer hungerLevel;

    public Dog(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    public void bark(){
        System.out.println(dogSize.getNoise());

    } //form of behaviour

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setTailLength(Integer tailLength) {
        this.tailLength = tailLength;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAggressionLevel(Integer aggressionLevel) {
        this.aggressionLevel = aggressionLevel;
    }

    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void hungry(){
        if (hungerLevel > 10){
            for (int i = 0; i < 10; i++) {
                bark();
            }

            System.out.println("Gimme foood!!! " + dogSize.getNoise());
        }
        else {
            System.out.println("I'm stuffed");
        }



    }

}
