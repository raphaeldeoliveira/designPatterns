package com.mycompany.designpatterns;

import com.mycompany.designpatterns.AbstractFactory.AbstractFactoryPatternDemo;
import com.mycompany.designpatterns.Factory.FactoryPatternDemo;

public class DesignPatterns {

    public static void main(String[] args) {
        
        // Factory
        System.out.println("-----------------\nFactory\n");
        FactoryPatternDemo factory = new FactoryPatternDemo();
        factory.factoryPatternDemo();
        
        // Abstract Factory
        System.out.println("-----------------\nAbstract Factory\n");
        AbstractFactoryPatternDemo abstractFactory = new AbstractFactoryPatternDemo();
        abstractFactory.init();
    }
}
