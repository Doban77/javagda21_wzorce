package com.javagda21.wzorce.creational.builder.GameCharacter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GameCharacter.Builder builder = new GameCharacter.Builder();

        List<GameCharacter> builderList = new ArrayList<GameCharacter>();

        GameCharacter char1 = builder
                .setName("Józek")
                .setHealth(100)
                .setMana(20)
                .setPoints(10)
                .create();

        GameCharacter char2 = builder
                .setName("Józek")
                .setHealth(100)
                .setMana(20)
                .setPoints(10)
                .create();

        GameCharacter char3 = builder
                .setName("Ziutek")
                .setHealth(200)
                .setMana(30)
                .setPoints(20)
                .create();

        GameCharacter char4 = builder
                .setName("Sław")
                .setHealth(1000)
                .setMana(200)
                .setPoints(100)
                .create();

        builderList.add(char1);
        builderList.add(char2);
        builderList.add(char3);
        builderList.add(char4);

    }
}
