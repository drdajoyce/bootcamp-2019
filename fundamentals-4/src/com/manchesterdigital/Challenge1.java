package com.manchesterdigital;

public class Challenge1 {

    private static final int BAD_OUTCOME = 0;
    private static final int GOOD_OUTCOME = 1;
    private static final int GREAT_OUTCOME = 2;

    public static void main(String[] args) {
        teaParty(6, 12);
    }

    private static void teaParty(int tea, int candy) {


        if (tea >= 5 && candy >= 5) {
            if ((tea >= 2 * candy) || (candy >= 2 * tea)) { //great specifically if got more than twice one quantity.
                System.out.println(GREAT_OUTCOME); //brackets around each expression for the or to help readability.
            }
                System.out.println(GOOD_OUTCOME); //returns good otherwise.
        }
            System.out.println(BAD_OUTCOME); // if good or great conditions not met, returns bad.

    }
}
