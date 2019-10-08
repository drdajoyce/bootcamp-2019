package com.manchesterdigital.optionalexplained;

import com.manchesterdigital.optionalexplained.Airline;
import com.manchesterdigital.optionalexplained.FlightInformation;

import java.util.Map;

public class FlightService {
    private static Map<String, FlightInformation> flights;

    static {
        flights = Map.of(
          "AB123", new FlightInformation("AB123"),
                "XK345", new FlightInformation("XK345"),
                "ST009", new FlightInformation("ST009")
                );

    } //to initialise anything in a static context.

    public FlightInformation retrieveFlight(final String flightNo){
        return flights.get(flightNo);
    }

    //good but not great
//    public Airline retrieveAirline(final String flightNo){
//        FlightInformation flight = retrieveFlight(flightNo);
//
//        if (flight.getAirline().isEmpty()){
//            throw new AirlineNotFoundException("Airline not found");
//        }
//
//        //getAirline picks up the box, get opens it.
//        return  flight.getAirline().get();
//    }

    public Airline retrieveAirline(final String flightNo){
        FlightInformation flight = retrieveFlight(flightNo);

        //throws message-less exception
       // return  flight.getAirline().orElseThrow(AirlineNotFoundException::new);

        //throws an exception message
       // return flight.getAirline().orElseThrow(() -> new AirlineNotFoundException("No flight found"));


        //returns a default
        return flight.getAirline().orElse(new Airline());

        //return an output from another class/source/service/interface.
       // return flight.getAirline().or(where it's coming from);
    }


}
