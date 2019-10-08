package com.manchesterdigital.optionalexplained;

import com.manchesterdigital.optionalexplained.Airline;

import java.util.Optional;

/**
 * POJO for flight info.
 */

public class FlightInformation {
    private final String flightNo;
    private String destination;
    private Optional<Airline> airline; //"has a" relationship.

    public FlightInformation(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Optional<Airline> getAirline() {
        return airline;
    }

    public void setAirline(Optional<Airline> airline) {
        this.airline = airline;
    }
}
