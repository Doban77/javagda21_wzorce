package com.javagda21.wzorce.behavioral.strategy;

public class TrimFormatter implements IFormaterCzcionki {
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.trim();
    }
}

