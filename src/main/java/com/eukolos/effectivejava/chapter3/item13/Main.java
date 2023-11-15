package com.eukolos.effectivejava.chapter3.item13;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("BMW", "X5", 2019);
        System.out.println(car);

        System.out.println(car.clone().getClass() == car.getClass());

        System.out.println(car.clone().equals(car));

        if (car.clone().hashCode() == car.hashCode()) {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }



    }
}
