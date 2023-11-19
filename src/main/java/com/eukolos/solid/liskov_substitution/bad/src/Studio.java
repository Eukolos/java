package com.eukolos.solid.liskov_substitution.bad.src;

public class Studio extends Apartment {
    public Studio() {
        this.numberOfBedrooms = 0;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}