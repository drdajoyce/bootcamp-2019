package com.manchesterdigital;

public class CostCalculator {


    public static int calculate(int time, String vehicle) {

//        if (time < 5) {
//            return 300;
//        } else if (time < 10) {
//            return 350;
//        } else if (time < 15) {
//            return 500;
//        } else if (time < 20) {
//            return 700;
//        } else if(time <24) {
//            return 400;
//        }

        if(vehicle.equalsIgnoreCase("Van")){
            return timeCalculator(new int[] {600, 700, 1000, 1400, 800}, time);
        }
         return timeCalculator(new int[] {300, 350, 500, 700, 400}, time);

//        throw new InvalidTimeException("Provided invalid time: " + time);
    }

    public static int timeCalculator(int [] prices, int time){
        if (time < 5) {
            return prices[0];
        } else if (time < 10) {
            return prices[1];
        } else if (time < 15) {
            return prices[2];
        } else if (time < 20) {
            return prices[3];
        } else if(time <24) {
            return prices[4];
        }
        throw new InvalidTimeException("Provided invalid time: " + time);
    }
}
