package com.javagda21.wzorce.creational.abstractfactory.fabryka_pecetow;

public class SamsungPC extends AbstarctPC {
    public SamsungPC(String nazwa, Computer_Class computer_class, int cpu_power, int gpu_power, boolean isOverpowered) {
        super(nazwa, computer_class, cpu_power, gpu_power, isOverpowered);
    }
}
