package com.javagda21.wzorce.creational.abstractfactory.fabryka_pecetow.abstracfactory.fabryka_rowerow;

public abstract class BikeFactory {

        public static Bike stworz1osobowyKross5przerzutek(){
            return new Bike("Kross", 1, 5, Typ_Roweru.BICYKL);
        }

        public static Bike stworzMerida1osobowy6przerzutek(){
            return new Bike("Merida", 1, 6, Typ_Roweru.BICYKL);
        }

        public static Bike stworzInianatandem3przerzutki(){
            return new Bike("Iniana", 2, 3, Typ_Roweru.TANDEM);
        }

}
