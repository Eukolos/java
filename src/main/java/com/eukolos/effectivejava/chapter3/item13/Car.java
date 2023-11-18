package com.eukolos.effectivejava.chapter3.item13;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car implements Cloneable {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car))
            return false;
        Car c = (Car) o;
        return c.brand == brand && c.model == model && c.year == year;
    }

    @Override
    public int hashCode() {
        return 31 * brand.hashCode() + model.hashCode() + year;
    }


    @Override
    public Car clone() {
        try {
            Car clone = (Car) super.clone();
            clone.setYear(this.year + 1);

            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
