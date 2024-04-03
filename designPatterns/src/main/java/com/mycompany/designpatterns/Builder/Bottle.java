package com.mycompany.designpatterns.Builder;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
