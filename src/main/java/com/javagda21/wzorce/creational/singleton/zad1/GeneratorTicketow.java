package com.javagda21.wzorce.creational.singleton.zad1;

public enum GeneratorTicketow {
//    private static GeneratorTicketow ourInstance = new GeneratorTicketow();
//
//    public static GeneratorTicketow getInstance() {
//        return ourInstance;
//    }
//
//    private GeneratorTicketow() {
//    }

    INSTANCE;

    private int numerek = 1;

    public int pobierzNastepnyNumerek (){
        return numerek++;
    }

}
