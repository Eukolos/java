package com.eukolos.solid.liskov_substitution.good.src;

public class BedroomAdder {
    public void addBedroom(PenthouseSuite penthouse) {
        penthouse.numberOfBedrooms += 1;
    }
}