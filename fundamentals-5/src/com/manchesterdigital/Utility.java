package com.manchesterdigital;

public class Utility {

    public static Boolean isEven(int a){ //wrapper class preferred, prepares for possibility of a null value.
//        if(a % 2 == 0){
//            return true;
//        }
//
//        return false;

        return (a % 2 ==0);
    }

    public static boolean sameName(String first, String second){
        return first.equalsIgnoreCase(second);
    } //better convention to start this method name with is.

    /**
     *Converts a string to a long
     *
     * @param input the input recieved.
     * @return a long if successful.
     * @throws NumberFormatException explain why that exception is happening for best practice. eg if input is not a
     * number & outside a long's range
     */

    public static Long convertStringToLong(String input) throws NumberFormatException {
        return new Long(input);
    }

}
