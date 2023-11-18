package com.eukolos.solid.open_closed.bad.src;

public class Greeter {
    public String formality;

    public String greet() {
        if (this.formality == "formal") {
            return "Good evening, sir.";
        }
        else if (this.formality == "casual") {
            return "Sup bro?";
        }
        else if (this.formality == "intimate") {
            return "Hello Darling!";
        }
        else {
            return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}