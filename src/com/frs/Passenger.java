package com.frs;

public class Passenger {

        private Address address;
        private Contact contact;
        private static int idCounter;

        public Passenger(String street, String city, String state, String name,String mobile, String email, int idCounter) {
            this.address = new Address(street,city,state);
            this.contact = new Contact(name, mobile,email);
            idCounter = idCounter++;
        }

        public int getIdCounter() {
            return idCounter;
        }

        public void setIdCounter(int idCounter) {
            idCounter = idCounter;
        }

        public Contact getContact() {
            return contact;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public void setContact(Contact contact) {
            this.contact = contact;
        }

        public static int getPassengerCount(){
            return idCounter;
        }

        @Override
        public String toString() {
            return "Passenger{" +
                    "address=" + address +
                    ", contact=" + contact +
                    ", idCounter=" + idCounter +
                    '}';
        }

        private static class Address {

            private String street;
            private String city;
            private String state;

            public Address(String street, String city, String state) {
                this.street = street;
                this.city = city;
                this.state = state;
            }

            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            @Override
            public String toString() {
                return "Address{" +
                        "street='" + street + '\'' +
                        ", city='" + city + '\'' +
                        ", state='" + state + '\'' +
                        '}';
            }
        }

        private static class Contact {

            private String name;
            private String phoneNumber;
            private String emailId;

            public Contact(String name, String phoneNumber, String emailId) {
                this.name = name;
                this.phoneNumber = phoneNumber;
                this.emailId = emailId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public String getEmailId() {
                return emailId;
            }

            public void setEmailId(String emailId) {
                this.emailId = emailId;
            }

            @Override
            public String toString() {
                return "Contact{" +
                        "name='" + name + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", emailId='" + emailId + '\'' +
                        '}';
            }
        }
    }

