package com.manchesterdigital;

public enum CompassDirections {
    NORTH(0),
    NORTH_EAST(45),
    EAST(90),
    SOUTH_EAST(135),
    SOUTH(180),
    SOUTH_WEST(225),
    WEST(270),
    NORTH_WEST(315);

    private Integer degrees;

    CompassDirections(Integer degrees) {
        this.degrees = degrees;
    }

    public Integer getDegrees() {
        return degrees;
    }
}
