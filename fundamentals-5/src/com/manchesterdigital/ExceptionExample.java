package com.manchesterdigital;

public class ExceptionExample {

    public static void main(String[] args) {
        int [] intArr = {12, 3, 5};

        printArray(0, intArr); //only call this way for stand alone programmes
        printArray(1, intArr);
        printArray(2, intArr);

        //problems
        try {
            //try to access element 3:
            printArray(3, intArr); //body of try is what you'd like to run. Keep problem areas in here only.
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.err.println("Element does not exist: " + ae.getLocalizedMessage()); //could put an alternative route to take.
        } //try & catch are not enforced.
    }

    private static void printArray(int index, int [] arr){
        System.out.println("Element " + index + " is " + arr[index]);
    }
}
