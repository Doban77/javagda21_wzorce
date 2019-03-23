package com.javagda21.wzorce.behavioral.strategy;

public class UpperFormatter implements IFormaterCzcionki {
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.toUpperCase();
    }
}
