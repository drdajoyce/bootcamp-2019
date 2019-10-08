package com.manchesterdigital.optionalexplained;

import java.util.Optional;

public class Airport {

    public static void main(String[] args) {
        FlightService flightService = new FlightService();

        FlightInformation flight = flightService.retrieveFlight("AB123");

        System.out.println("flight.getAirline().getName() = " + flight.getAirline().get().getName());

        //may have a flight info which could be null:
        Optional<FlightInformation> flight1 = Optional.of(flight);

        //could potentially be from database. Value of optional may be null but we're not bothered:
        Optional<FlightInformation> flight2 = Optional.ofNullable(flight);

    }

}
