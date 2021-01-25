package com.frs;
import java.util.Arrays;

public class TouristTicket {





        private String hotelAddress;
        private String[] selectedTouristLocation=new String[5];

        public TouristTicket(String hotelAddress, String[] selectedTouristLocation) {
            this.hotelAddress = hotelAddress;
            this.selectedTouristLocation = selectedTouristLocation;
        }

        public String getHotelAddress() {
            return hotelAddress;
        }

        public void setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
        }

        public String[] getSelectedTouristLocation() {
            return selectedTouristLocation;
        }

        public void setSelectedTouristLocation(String[] selectedTouristLocation) {
            this.selectedTouristLocation = selectedTouristLocation;
        }
        public void  removeTouristLocation(String location){

        }
        public void addTouristLocation(String location){

        }

        @Override
        public String toString() {
            return "TouristTicket{" +
                    "hotelAddress='" + hotelAddress + '\'' +
                    ", selectedTouristLocation=" + Arrays.toString(selectedTouristLocation) +
                    '}';
        }
    }

