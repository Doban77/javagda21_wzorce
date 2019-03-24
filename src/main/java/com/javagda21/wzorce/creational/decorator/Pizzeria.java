package com.javagda21.wzorce.creational.decorator;

public abstract class Pizzeria {

    public static IPizza Mergerita(){
        return new CustomPizza(new SimplePizza())
                .addIngredients("Oregano");
    }

    public static IPizza Salami(){
        return new CustomPizza(new SimplePizza())
                .addIngredients("Chili")
                .addIngredients("Salami");
    }
}
