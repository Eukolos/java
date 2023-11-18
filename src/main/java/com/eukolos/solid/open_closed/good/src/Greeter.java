package com.eukolos.solid.open_closed.good.src;

public class Greeter {
    private Personality personality;

    public Greeter(Personality personality) {
        this.personality = personality;
    }

    public String greet() {
        return this.personality.greet();
    }
}