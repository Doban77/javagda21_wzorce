package com.javagda21.wzorce.creational.abstractfactory.fabryka_pecetow;

public abstract class AbstarctPC {

    protected String nazwa;
    protected Computer_Class computer_class;
    protected int cpu_power;
    protected int gpu_power;
    protected boolean isOverpowered;

    public AbstarctPC(String nazwa, Computer_Class computer_class, int cpu_power, int gpu_power, boolean isOverpowered) {
        this.nazwa = nazwa;
        this.computer_class = computer_class;
        this.cpu_power = cpu_power;
        this.gpu_power = gpu_power;
        this.isOverpowered = isOverpowered;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
