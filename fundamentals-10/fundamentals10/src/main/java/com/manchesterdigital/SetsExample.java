package com.manchesterdigital;

import java.util.*;

public class SetsExample {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John"); //add rather than put because onl one object/parameter.
        names.add("April");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack"); //only one Jack will actually get added.
        names.add("Emalin");

        for (String name :names){
            System.out.println("name = " + name);
        }

        Set<Integer> ages = new TreeSet<>();
        ages.add(22);
        ages.add(22);
        ages.add(22);
        ages.add(2);
        ages.add(99);
        ages.add(1);
        ages.add(77);

        System.out.println("ages = " + ages);
        System.out.println("names = " + names);

        List<String> footballers = Arrays.asList("Ronaldo", "Messi", "Neymar", "Rooney", "Zlatan", "Ronaldo");

        Set<String> uniqueFootballers = new TreeSet<>(footballers);
        System.out.println("uniqueFootballers = " + uniqueFootballers);

        //union (what's in both):
        Set<String> cats = new HashSet<>();
        cats.add("Lion");
        cats.add("Cheetah");

        Set<String> reptiles = new HashSet<>();
        reptiles.add("Snake");
        reptiles.add("Crocodile");

        Set<String> zoo = new HashSet<>(cats);
        zoo.addAll(reptiles);

        System.out.println("zoo = " + zoo);

        //intersection:
        Set<String> otherNames = new HashSet<>();
        otherNames.add("John");
        otherNames.add("Joanne");
        otherNames.add("Jill");
        otherNames.add("Susan");

        Set<String> intersectionOfBoth = new HashSet<>(names);
        intersectionOfBoth.retainAll(otherNames);
        System.out.println("intersectionOfBoth = " + intersectionOfBoth);

        //differences:
        Set<String> nameDifferences = new HashSet<>(names);
        nameDifferences.removeAll(otherNames);

        //displays the elements in names that aren't in otherNames.
        System.out.println("nameDifferences = " + nameDifferences);





    }
}
