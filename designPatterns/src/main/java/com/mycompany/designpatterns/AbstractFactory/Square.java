package com.mycompany.designpatterns.AbstractFactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw() ");
    }
}
