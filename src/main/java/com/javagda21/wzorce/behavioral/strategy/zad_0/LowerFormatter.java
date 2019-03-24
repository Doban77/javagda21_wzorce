package com.javagda21.wzorce.behavioral.strategy.zad_0;

public class LowerFormatter implements IFormaterCzcionki {
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.toLowerCase();
    }
}
