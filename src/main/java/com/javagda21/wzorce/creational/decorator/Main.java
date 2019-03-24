package com.javagda21.wzorce.creational.decorator;

public class Main {

    public static void main(String[] args) {

        SimplePizza simplePizza = new SimplePizza();
        CustomPizza customPizza = new CustomPizza(simplePizza);
        customPizza
                .addIngredients("Salami")
                .addIngredients("Cebula")
                .addIngredients("Papryka")
                .addIngredients("Pomidor");

        System.out.println(customPizza.getIngredients());
        System.out.println(customPizza.getPrice());
    }
}
