package com.mycompany.designpatterns.Builder;

public class BuildPatternDemo {
    public static void init() {
        MealBuilder mealBuilder = new MealBuilder();
    
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total: "+vegMeal.getCost());
    
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total: "+nonVegMeal.getCost());
    }    
}
