package com.manchesterdigital;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsSol {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Rock, Paper or Scissors");
        String userChoice = userInput.nextLine();

        Random random = new Random();
        double computerChoice = random.nextDouble();

        String computerSelection = "SCISSORS";

        if(computerChoice <= 0.33){
            computerSelection = "ROCK";
        }
        else if(computerChoice <=0.66){
            computerSelection = "PAPER";
        }

        String resultOfGame = outcome(userChoice, computerSelection);
        //System.out.println(String.format("Computer choice was %s, User choice was %s ==>"));
        System.out.println(resultOfGame);
    }

    private static String outcome(String userChoice, String computerChoice){
        String result = "";

        if(userChoice.equalsIgnoreCase(computerChoice)){
            result = "DRAW";
        }
        else{
            //other permutations.
            if(userChoice.equalsIgnoreCase("PAPER")){
                if(computerChoice.equalsIgnoreCase("ROCK")) {
                    result = "COMP WINS";
                }
                    else {
                        result = "USER WINS";
                    }
                }
                else if (userChoice.equalsIgnoreCase("SCISSORS")){
                    if(computerChoice.equalsIgnoreCase("ROCKS")){
                        result = "COMP WINS";
                    }
                    else{
                        result = "USER WINS";
                    }
                    }
                else {
                    result = "USER WINS";
            }
        }
        return result;
    }
}
