package com.manchesterdigital;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        //Generic way of creating an ArrayList (not best practice):
        ArrayList names1 = new ArrayList();

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("John");
        names2.add("Sue");
        names2.add(2, "Steve"); //adds the element at a specific index.

        int numberOfElements = names2.size();
        System.out.println("Number of elements: " + numberOfElements);

        String firstElement = names2.get(0); //would get index out of bounds if chose 5 as parameter.
        System.out.println("First element: " + firstElement);

        String removedElement = names2.remove(0);
        System.out.println("Removed => " +removedElement);

        System.out.println(names2.get(0));

        boolean removedElementViaObject = names2.remove("Steve");
        System.out.println("Removed by object => " +removedElementViaObject);


        ArrayList<String> zooAnimals = new ArrayList<>();
        zooAnimals.add("Lion");
        zooAnimals.add("Hippo");
        zooAnimals.add("Leopard");

        //Are there any leopards in the zoo?
        System.out.println("Contains leopards? " + zooAnimals.contains("Leopard")); //case sensitive.

        Collections.sort(zooAnimals); //sorts zooAnimals in alphabetical order since elements are string.
        System.out.println("After sort, animal at index 0: " +zooAnimals.get(0));

        Collections.shuffle(zooAnimals); //randomises the arraylist. Useful for testing too.


        zooAnimals.set(1, "Cheetah"); //allows us to set or override the element at that position.
        System.out.println(zooAnimals.get(1));

        zooAnimals.clear(); //empties the ArrayList.
        System.out.println(zooAnimals.size());

        int [] lotteryArr = new int[10];
        int []lotteryArr2 = {1, 23, 45, 6, 88};

        //creates a predefined array list.
        //List<Integer> lotteryNumbers = Arrays.asList(1, 23, 45, 6, 88);

    }
}
