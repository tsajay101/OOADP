package com.frs;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {


    public static void main(String[] arg) {

        String[] locations = {"DEL", "BLR", "TIR", "VGA", "MAA"};

        Flight f = new Flight("123", "AirFrance", 128, 35);
        Passenger p = new Passenger("17", "BLR", "KA", "Ajay", "900000000", "ajay@gmail.com", 15);
        Ticket ticket = new Ticket("2234556", "BLR", "DEL", LocalDateTime.now(), LocalDateTime.now().plusMinutes(70), p, "33",
                false, 675, f);


        System.out.println(f.checkFlightDetails());
        System.out.println(f.checkSeatAvailability());

        System.out.println(f.getAirlineName());




    }
}

