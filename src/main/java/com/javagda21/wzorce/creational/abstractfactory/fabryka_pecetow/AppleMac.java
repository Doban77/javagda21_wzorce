package com.javagda21.wzorce.creational.abstractfactory.fabryka_pecetow;

public class AppleMac extends AbstarctPC {
    public AppleMac(String nazwa, int cpu_power, int gpu_power, boolean isOverpowered) {
        super(nazwa, Computer_Class.APPLE, cpu_power, gpu_power, isOverpowered);

        System.out.println("Stworzono "+ this.getNazwa());
    }
    public static AbstarctPC stworzMaca1 (){
        return new AppleMac("Mac1", 100, 200, true);
    }

    public static AbstarctPC stworzMaca2(){
        return new AppleMac("Mac2", 200, 50, false);
    }

}
