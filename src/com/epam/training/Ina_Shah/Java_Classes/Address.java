package com.epam.training.Ina_Shah.Java_Classes;

public class Address {
        private String city;
        private String street;
        private int houseId;
        private int flatId;

        public Address(String city, String street, int houseId, int flatId) {
            this.city = city;
            this.street = street;
            this.houseId = houseId;
            this.flatId = flatId;
        }

    public Address(){
        this.city = "Unknown";
        this.street = "Unknown";
    }

    public Address(String city, String street, int houseId) {
        this.city = city;
        this.street = street;
        this.houseId = houseId;
        this.flatId = 0;
    }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getHouseId() {
            return houseId;
        }

        public int getFlatId() {
            return flatId;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setHouseId(int houseId) {
            this.houseId = houseId;
        }

        public void setFlatId(int flatId) {
            this.flatId = flatId;
        }

        @Override
         public String toString() {
            return
                    "Address: "+ city +
                   ", " + street +
                   " " + houseId +
                    "-" + flatId;
    }

}
