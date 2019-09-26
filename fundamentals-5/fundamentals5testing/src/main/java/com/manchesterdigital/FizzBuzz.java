package com.manchesterdigital;

public class FizzBuzz {
    public static String fizzBuzzCheck(int i) {

        if(i % 3 == 0){
            if(i % 5 == 0){
                return "fizzbuzz";
            }
            return "fizz";
        } else if(i % 5 == 0){
            return "buzz";
        }
        StringBuilder number = new StringBuilder();
        number.append(i);
        return number.toString();

    }
//array extension.
    public static String [] fizzBuzzArray(int [] arr){

        String [] answers = new String[arr.length];

        for(int i=0; i < arr.length; i++){
            answers[i] = fizzBuzzCheck(arr[i]);
        }

        return answers;
    }
}
