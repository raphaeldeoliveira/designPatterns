package com.mycompany.designpatterns.Prototype;

public interface Shape extends Cloneable {
    void draw();
    Object clone();
}