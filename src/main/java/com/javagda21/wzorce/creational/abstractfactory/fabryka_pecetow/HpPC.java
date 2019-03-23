package com.javagda21.wzorce.creational.abstractfactory.fabryka_pecetow;

public class HpPC extends AbstarctPC {
    public HpPC(String nazwa, Computer_Class computer_class, int cpu_power, int gpu_power, boolean isOverpowered) {
        super(nazwa, computer_class, cpu_power, gpu_power, isOverpowered);
    }
}
