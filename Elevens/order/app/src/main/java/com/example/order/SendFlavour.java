package com.example.order;

public class SendFlavour {
    private Flavour flavour;

    public SendFlavour() {
    }

    public SendFlavour(Flavour flavour) {
        this.flavour = flavour;
    }

    public String SendFlavour(){
        return flavour.getFlavourOfPizza(); // getting the Flavour

    }
}
