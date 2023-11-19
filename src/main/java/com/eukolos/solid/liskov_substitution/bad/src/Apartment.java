package com.eukolos.solid.liskov_substitution.bad.src;

public abstract class Apartment {
    public int squareFootage;
    public int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);
}