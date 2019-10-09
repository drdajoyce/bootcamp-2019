package com.manchesterdigital;

import java.util.Arrays;

public class NotAlone {

    public static void main(String[] args) {

       int [] test1 = {1, 2, 3};

        int[] result1 = notAlone(test1, 2);

        System.out.println("result1[0] = " + result1[0]);
        System.out.println("result1[1] = " + result1[1]);
        System.out.println("result1[2] = " + result1[2]);
        System.out.println("result1 = " + Arrays.toString(result1));

        int [] test2 = {1, 2, 3, 2, 5, 2};
        int[] result2 = notAlone(test2, 2);
        System.out.println("result1 = " + Arrays.toString(result2));

        int [] test3 = {3, 4};
        int[] result3 = notAlone(test3, 3);
        System.out.println("result1 = " + Arrays.toString(result3));



    }//end of main

    private static int [] notAlone(int [] array, int number){
      int [] result = new int[array.length];
      result[0] = array[0];
      result[array.length-1] = array[array.length-1];

        for (int i = 1; i < array.length-1; i++) {
            if (array[i] == number && !(array[i-1]==number) && !(array[i+1]==number)){
                result[i] = Math.max(array[i-1], array[i+1]);
            } else { result[i] = array[i];}
        }
        return result;
    }

}//end of class
