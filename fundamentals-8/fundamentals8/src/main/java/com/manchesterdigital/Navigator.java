package com.manchesterdigital;

public class Navigator {

    private CompassDirections compassDirections;
    private String direction;
    private Integer currentPosition = 0;




    public Navigator(String direction) {
        this.direction = direction;
    }

    private static CompassDirections changeDirection(Integer currentPosition, Integer degrees){

        Integer newPosition = currentPosition;
        newPosition += degrees;



        return null;
    }

    private static CompassDirections checkDirection(Integer degrees){
        switch (degrees){
            case 45:
                return CompassDirections.NORTH_EAST;
            case 90:
                return CompassDirections.EAST;
            case 135:
                return CompassDirections.SOUTH_EAST;
            case 180:
                return CompassDirections.SOUTH;
            case 225:
                return CompassDirections.SOUTH_WEST;
            case 270:
                return CompassDirections.WEST;
            case 315:
                return CompassDirections.NORTH_WEST;
            default:
                return CompassDirections.NORTH;

        }
    }

    public static void main(String[] args) {
        System.out.println(CompassDirections.NORTH_WEST.getDegrees());
        System.out.println(checkDirection(45));


    }
}
