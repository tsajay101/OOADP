package com.frs;

public class RegularTicket {

        private String specialService;

        public RegularTicket(String specialService) {
            this.specialService = specialService;
        }

        public String getSpecialService() {
            return specialService;
        }

        public void setSpecialService(String specialService) {
            this.specialService = specialService;
        }

        @Override
        public String toString() {
            return "RegularTicket{" +
                    "specialService='" + specialService + '\'' +
                    '}';
        }
    }

