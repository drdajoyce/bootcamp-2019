package com.manchesterdigital;

public abstract class Animal {
//    protected Integer age;
//    protected String gender;
//    protected Integer weightInLbs;
    //protected means child classes must be initialised with these parameters too.

    private Integer age;
    private String gender;
    private Integer weightInLbs;

    public Animal(Integer age, String gender, Integer weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("Sleeping... zzz");
    }

    public abstract void move();

}
