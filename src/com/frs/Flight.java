package com.frs;


public class Flight {
        private String flightNumber;
        private String airlineName;
        private int capacity;
        private int bookedSeats;

        public Flight(String flightNumber, String airlineName, int capacity, int bookedSeats) {
            this.flightNumber = flightNumber;
            this.airlineName = airlineName;
            this.capacity = capacity;
            this.bookedSeats = bookedSeats;
        }

        public String getFlightNumber() {
            return this.flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getAirlineName() {
            return this.airlineName;
        }

        public void setAirlineName(String airlineName) {
            this.airlineName = airlineName;
        }

        public int getCapacity() {
            return this.capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public int getBookedSeats() {
            return this.bookedSeats;
        }

        public void setBookedSeats(int bookedSeats) {
            this.bookedSeats = bookedSeats;
        }

        public String checkFlightDetails() {
            return this.flightNumber + " " + this.airlineName;
        }

        public int checkSeatAvailability() {
            return this.capacity - this.bookedSeats;
        }

        public void booking() {
        }

        public String toString() {
            return "Flight{flightNumber='" + this.flightNumber + "', airlineName='" + this.airlineName + "', capacity=" + this.capacity + ", bookedSeats=" + this.bookedSeats + "}";
        }
    }


