package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;



public class RossoRestaurant {

    private static Map<String, String> menu;
    static {
        menu = new HashMap<>();
        menu.put(Dishes.INDIAN.toString(),"Tandoori Chicken, Bhuna Ghosht" );
        menu.put(Dishes.MEXICAN.toString(),"Taco, Burrito");
        menu.put(Dishes.PAN_ASIAN.toString(),"Stir fry noodles, Dimsum");
        menu.put(Dishes.ENGLISH.toString(),"Beef Wellington, Fish and Chips");

    }

    //working version without map.

//    public static String dishType(String region) {
//
//        String output = "";
//
//        if (!region.equals(Dishes.MEXICAN.toString()) && !region.equals(Dishes.INDIAN.toString())
//                && !region.equals(Dishes.PAN_ASIAN.toString()) && !region.equals(Dishes.ENGLISH.toString())){
//
//            throw new InvalidRegionException("We do not serve " + region + " food");
//
//        }
//
//
//        if (region.equals(Dishes.INDIAN.toString())){
//            output = "Tandoori Chicken, Bhuna Ghosht";
//        }
//        else if(region.equals(Dishes.MEXICAN.toString())) {
//            output = "Taco, Burrito";
//        }
//        else if (region.equals(Dishes.PAN_ASIAN.toString())){
//            output = "Stir fry noodles, Dimsum";
//        } else{ output = "Beef Wellington, Fish and Chips";}
//
//        return output;
//    }

    public static String dishType(String cuisine) {

        if (!cuisine.equals(Dishes.MEXICAN.toString()) && !cuisine.equals(Dishes.INDIAN.toString())
                && !cuisine.equals(Dishes.PAN_ASIAN.toString()) && !cuisine.equals(Dishes.ENGLISH.toString())){

            throw new InvalidRegionException("We do not serve " + cuisine + " food");
        }

        String output = "";

        for (Map.Entry<String, String> me : menu.entrySet()) {

            if (cuisine == me.getKey()) {
                output = me.getValue();
            }
        }

        return output;
    }
}
