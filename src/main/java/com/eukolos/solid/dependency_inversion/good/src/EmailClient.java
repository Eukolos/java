package com.eukolos.solid.dependency_inversion.good.src;

public class EmailClient implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions == "sunny");
        System.out.print("It is sunny");
    }
}
