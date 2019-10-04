package com.manchesterdigital;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class RegMeNow {
    // static Map
    private static Map<String, Integer> replacementCharacters;
    static {
        replacementCharacters = new HashMap<>();
        replacementCharacters.put("S", 5);
        replacementCharacters.put("A", 4);
        replacementCharacters.put("G", 9);
        replacementCharacters.put("B", 8);
        replacementCharacters.put("I", 1);
    }


    public static String characterConverter(String numberPlate) {
        if (numberPlate.length() > 7) {
            throw new RegMeNowException("Your plate is too big");
        }
        if (numberPlate.length() < 5) {
            throw new RegMeNowException("Your plate is too small");
        }
        //empty string builder for creating final result.
        StringBuilder result = new StringBuilder();

        /*splits input string into an array of its individual characters
        e.g. if numberPlate = "ABCDE", numberPlate.split("") = {"A", "B", "C", "D", "E"}.
         */
        String[] numbersArray = numberPlate.split("");
        /*loops around the split array, checking every element to see if they match any of the keys from the map.
        If they do, the replacement number associated with that key will be added to our StringBuilder.
        If not, the orignal character is added to it.
         */
        for (String number : numbersArray) {
            if (replacementCharacters.containsKey(number)) {
                result.append(replacementCharacters.get(number));
            } else {
                result.append(number);
            }
            //result is still a StringBuilder, so convert to a String.
        } return result.toString();
    }
}
// if split string is contained in replacement Character key, replace with value
// char[] plateCharacters = numberPlate.toCharArray();
       /*for (int i = 0; i < plateCharacters.length; i++) {
           if (plateCharacters[i] == 'S') {
               result.append("5");
           } else if (plateCharacters[i] == 'A') {
               result.append("4");
           } else if (plateCharacters[i] == 'G') {
               result.append("9");
           } else if (plateCharacters[i] == 'B') {
               result.append("8");
           } else if (plateCharacters[i] == 'I'){
               result.append("1");
           } else {
               result.append(plateCharacters[i]);
           }
       }
        */