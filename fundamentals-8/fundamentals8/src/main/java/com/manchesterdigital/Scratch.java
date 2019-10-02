package com.manchesterdigital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scratch {

    public static final String RED_COLOUR = "RED";

    public static void main(String[] args) {
//
//        System.out.println("Colour " + RED_COLOUR);
//
//        System.out.println(RainbowColours.BLUE.toString());
//
//        OrderProcessor orderProcessor = new OrderProcessor(OrderStatus.AWAITING_PAYMENT);
//
//        orderProcessor.printOrderMessage();
//        orderProcessor.obtainCurrentOrderStatus();
//
//        Dog poodle = new Dog(DogSize.SMALL); //we've set up a constructor so can't leave parameter empty by that
//        //constructor's definition.
//        poodle.setHungerLevel(100);
//        poodle.hungry();
//
//        Dog labrador = new Dog(DogSize.LARGE);
//        labrador.bark();
//
//        Address address = new Address("1st Street", "Manchester","M23 4TB");
//        Person person = new Person("Jill","Jones",34, address);
//
//        person.printAddress();

//        Address address = new Address("1st Street", "Manchester","M23 4TB");
//        Person person = new Person("Jill","Jones",34, address);
//        System.out.println(person.toString());
//
//        Student student = new Student("Jack","Smith", 23, address);
//        student.setUniversityName("Man Met");
//        System.out.println(student.toString());

        Lights lights = new Lights();
        Fan pelonisFan = new Fan();

        List<Controls> controlsList = Arrays.asList(lights, pelonisFan);
        //List is an interface, so ArrayList inherits from it. So the bottom is permissible.

        List<Controls> controls = new ArrayList<>();
        controls.add(pelonisFan);
        controls.add(lights);

        for (Controls controllableItem : controls){
            controllableItem.switchOn();
            controllableItem.switchOff();
        }


    }
}
