package com.manchesterdigital;

public class RossoRestaurant {
    public static String dishType(String region) {

        String output = "";

        if (!region.equals(Dishes.MEXICAN.toString()) && !region.equals(Dishes.INDIAN.toString())
                && !region.equals(Dishes.PAN_ASIAN.toString()) && !region.equals(Dishes.ENGLISH.toString())){

            throw new InvalidRegionException("We do not serve " + region + " food");

        }


        if (region.equals(Dishes.INDIAN.toString())){
            output = "Tandoori Chicken, Bhuna Ghosht";
        }
        else if(region.equals(Dishes.MEXICAN.toString())) {
            output = "Taco, Burrito";
        }
        else if (region.equals(Dishes.PAN_ASIAN.toString())){
            output = "Stir fry noodles, Dimsum";
        } else{ output = "Beef Wellington, Fish and Chips";}

        return output;
    }
}
