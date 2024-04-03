package com.mycompany.designpatterns;

import com.mycompany.designpatterns.AbstractFactory.AbstractFactoryPatternDemo;
import com.mycompany.designpatterns.Builder.BuildPatternDemo;
import com.mycompany.designpatterns.Factory.FactoryPatternDemo;
import com.mycompany.designpatterns.Singleton.SingletonPatternDemo;

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
        
        // Singleton
        System.out.println("-----------------\nAbstract Factory\n");
        SingletonPatternDemo singleton = new SingletonPatternDemo();
        singleton.init();
        
        // Builder
        System.out.println("-----------------\nAbstract Factory\n");
        BuildPatternDemo builder = new BuildPatternDemo();
        builder.init();
    }
}
