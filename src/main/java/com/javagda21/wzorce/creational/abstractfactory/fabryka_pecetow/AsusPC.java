package com.javagda21.wzorce.creational.abstractfactory.fabryka_pecetow;

public class AsusPC extends AbstarctPC {
    public AsusPC(String nazwa, int cpu_power, int gpu_power, boolean isOverpowered) {
        super(nazwa, Computer_Class.ASUS, cpu_power, gpu_power, isOverpowered);

        System.out.println("Stworzono "+ this.getNazwa());
    }

    public static AbstarctPC nowyAsus1(){
        return new AsusPC("Asusik", 12, 34, false);
    }

    public static AbstarctPC nowyAsusik2(){
        return new AsusPC("Asus2", 50, 200, true);
    }
}

