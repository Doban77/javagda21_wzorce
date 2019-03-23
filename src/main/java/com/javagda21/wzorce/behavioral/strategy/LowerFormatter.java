package com.javagda21.wzorce.behavioral.strategy;

public class LowerFormatter implements IFormaterCzcionki {
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.toLowerCase();
    }
}
