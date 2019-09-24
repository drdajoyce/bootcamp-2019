package com.manchesterdigital;

public class Challenge2 { //boo

    public static void main(String[] args) {
        registrationGenerator("GBCDEFG");
    }

    private static String registrationGenerator(String input) {
        String[] inputAsArr = input.split("");

        if(inputAsArr[0].equals("S")){
            inputAsArr[0] = "5";
        } else if(inputAsArr[0].equals("A")){
            inputAsArr[0] = "4";
        } else if(inputAsArr[0].equals("I")){
            inputAsArr[0] = "1";
        } else if(inputAsArr[0].equals("B")){
            inputAsArr[0] = "8";
        } else if(inputAsArr[0].equals("G")){
            inputAsArr[0] = "9";
        } else {inputAsArr[0] = inputAsArr[0];}

         if(inputAsArr[1].equals("S")){
            inputAsArr[1] = "5";
        } else if(inputAsArr[0].equals("A")){
            inputAsArr[1] = "4";
        } else if(inputAsArr[0].equals("I")){
            inputAsArr[1] = "1";
        } else if(inputAsArr[0].equals("B")){
            inputAsArr[1] = "8";
        } else if(inputAsArr[0].equals("G")){
            inputAsArr[1] = "9";
        }

        else if(inputAsArr[2].equals("S")){
            inputAsArr[2] = "5";
        } else if(inputAsArr[2].equals("A")){
            inputAsArr[2] = "4";
        } else if(inputAsArr[0].equals("I")){
            inputAsArr[2] = "1";
        } else if(inputAsArr[0].equals("B")){
            inputAsArr[2] = "8";
        } else if(inputAsArr[0].equals("G")){
            inputAsArr[2] = "9";
        }

        else if(inputAsArr[3].equals("S")){
            inputAsArr[3] = "5";
        } else if(inputAsArr[0].equals("A")){
            inputAsArr[3] = "4";
        } else if(inputAsArr[0].equals("I")){
            inputAsArr[3] = "1";
        } else if(inputAsArr[0].equals("B")){
            inputAsArr[3] = "8";
        } else if(inputAsArr[0].equals("G")){
            inputAsArr[3] = "9";
        }

        else if(inputAsArr[4].equals("S")){
            inputAsArr[4] = "5";
        } else if(inputAsArr[4].equals("A")){
            inputAsArr[4] = "4";
        } else if(inputAsArr[4].equals("I")){
            inputAsArr[4] = "1";
        } else if(inputAsArr[4].equals("B")){
            inputAsArr[4] = "8";
        } else if(inputAsArr[4].equals("G")){
            inputAsArr[4] = "9";
        }

        else if(inputAsArr[5].equals("S")){
            inputAsArr[5] = "5";
        } else if(inputAsArr[5].equals("A")){
            inputAsArr[5] = "4";
        } else if(inputAsArr[5].equals("I")){
            inputAsArr[5] = "1";
        } else if(inputAsArr[5].equals("B")){
            inputAsArr[5] = "8";
        } else if(inputAsArr[5].equals("G")){
            inputAsArr[5] = "9";
        }

        else if(inputAsArr[6].equals("S")){
            inputAsArr[6] = "5";
        } else if(inputAsArr[6].equals("A")){
            inputAsArr[6] = "4";
        } else if(inputAsArr[6].equals("I")){
            inputAsArr[6] = "1";
        } else if(inputAsArr[6].equals("B")){
            inputAsArr[6] = "8";
        } else if(inputAsArr[6].equals("G")){
            inputAsArr[6] = "9";
        }

        System.out.println(inputAsArr[0]);


        StringBuilder plate = new StringBuilder();

        plate.append(inputAsArr[0]).append(inputAsArr[1]);

        System.out.println(plate);



        return "inputAsArr";
    }
}
