package com.javagda21.wzorce.creational.builder.GameCharacter;

import lombok.Data;

@Data
public class GameCharacter {

    private String name;
    private int health, mana, points;

    public GameCharacter(String name, int health, int mana, int points) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.points = points;
    }

    public static class Builder {

        private String name;
        private int health, mana, points;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder setMana(int mana) {
            this.mana = mana;
            return this;
        }

        public Builder setPoints(int points) {
            this.points = points;
            return this;
        }
        public GameCharacter create(){
            return new GameCharacter(name, health, mana, points);
        }
    }
}
