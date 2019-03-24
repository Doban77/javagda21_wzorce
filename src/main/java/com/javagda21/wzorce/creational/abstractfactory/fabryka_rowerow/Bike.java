package com.javagda21.wzorce.creational.abstractfactory.fabryka_rowerow;

import lombok.Data;
@Data
public class Bike {
    private String marka;
    private int ilosc_miejsc;
    private int ilosc_przerzutek;
    private Typ_Roweru typ_roweru;


    Bike(String marka, int ilosc_miejsc, int ilosc_przerzutek, Typ_Roweru typ_roweru) {
        this.marka = marka;
        this.ilosc_miejsc = ilosc_miejsc;
        this.ilosc_przerzutek = ilosc_przerzutek;
        this.typ_roweru = typ_roweru;
    }
}
