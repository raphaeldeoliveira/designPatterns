package com.mycompany.designpatterns.Prototype;

public class PrototypePatternDemo {
    public static void init() {
        ShapeCache.loadCache();
        
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: "+clonedShape.getType());
        
        Shape clonedShape = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: "+clonedShape.getType());
        
        Shape clonedShape = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: "+clonedShape.getType());
    }
}
