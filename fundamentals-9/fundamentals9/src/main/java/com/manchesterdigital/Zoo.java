package com.manchesterdigital;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

//        //not possible with the animal as abstract - can only make specific instances of animals from classes
        //inheriting from Animal.
//        Animal animal = new Animal(20, "Female", 100);
//        animal.eat();
//        animal.sleep();

//        Bird bird = new Bird(23, "Male", 20, 10);

        Chicken bernardMatthews = new Chicken(23, "Male", 15, 10);
        bernardMatthews.move();
        bernardMatthews.eat();
        bernardMatthews.sleep();

        Magpie magpie = new Magpie(34, "Male", 50, 30);

        List<Animal> animals = new ArrayList<Animal>(); //list is also a polymorphism eg because List is an interface.
        animals.add(magpie);
        animals.add(bernardMatthews);

        for (Animal animal : animals){
            animal.move(); //eg of polymorphism - can change multiple animals with one command.
        }

        List<Bird> birds = new ArrayList<Bird>();
        birds.add(magpie);
        birds.add(bernardMatthews);

        for (Bird bird : birds){
            bird.move();
        }

        //can help you switch implementations at will without breaking stuff.
        Flyable someAnimalThatFlies = new Magpie(34, "Male", 50, 30);

        List<Flyable> flyables = new ArrayList<Flyable>();
        flyables.add(magpie); //would get an error if tried to add bernardMatthews - it doesn't implement Flyable.





//       protected version
//        bird.age = 55; //can change this value when age is protected because we're in the same package as the
//        protected variable.

    }

}
