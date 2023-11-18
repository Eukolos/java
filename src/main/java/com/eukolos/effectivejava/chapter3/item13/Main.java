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

        Car car2 = car.clone();
        Car car3 = car.clone();
        Car car4 = car.clone();

        Car car5 = car2.clone();
        Car car6 = car3.clone();

        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);

        // we have to think carefully when we use clone method, because it can be dangerous about setYear

    }
}
