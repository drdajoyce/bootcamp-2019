package com.manchesterdigital;

public class RestaurantBribe {

    public static void main(String[] args) {
        Waiter(9,6);
    }

    public static void Waiter(int style, int bribe){

        if(!(style >= 8) && !(bribe >= 5)){
            System.out.println("Not allowed in");
        }
    }
}
