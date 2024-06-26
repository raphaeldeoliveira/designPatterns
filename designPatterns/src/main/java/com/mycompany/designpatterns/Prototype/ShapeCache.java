package com.mycompany.designpatterns.Prototype;

public class ShapeCache {
    private static HashTable<String, Shape> shapeMap = new HashTable<String, Shape>();
    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
