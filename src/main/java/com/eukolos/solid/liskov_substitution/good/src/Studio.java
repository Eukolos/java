package com.eukolos.solid.liskov_substitution.good.src;

public class Studio {
    public int squareFootage;
    public int numberOfRooms;

    public Studio() {
        this.numberOfRooms = 0;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}
