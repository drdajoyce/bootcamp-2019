package com.manchesterdigital;

import java.util.ArrayList;

public class ForEachExample {

    public static void main(String[] args) {
        /**
         *  for (datatype varName : collection){
         *  //some logic for the loop
         *  }
         */

        ArrayList<String> students = new ArrayList<>();
        students.add("Callum");
        students.add("Andrew");
        students.add("Trump");

        for (String student : students){
            System.out.println("student = " + student);
        } //lets you get a hold of students within the block.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);

        System.out.println("numbers result = " + only1or4(numbers));




    }

    private static boolean only1or4(ArrayList<Integer> numbers) {
        boolean result = true;

        for (Integer number : numbers) {
            if (!number.equals(1) && !number.equals(4)) {
                result = false;
                break;
            }
        }

        return result;
    }

}
