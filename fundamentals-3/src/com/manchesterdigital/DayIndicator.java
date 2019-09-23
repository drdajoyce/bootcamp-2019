package com.manchesterdigital;

public class DayIndicator {

    public static void main(String[] args) {
        int Day = 7;

        if( Day <= 5){
            System.out.println("This is a weekday");
            if(Day % 2 == 0){
                System.out.println("Go to the gym!");
            }
        }
        else if(Day ==7){
            System.out.println("Do the gardening!");
        }
    }
}
