package com.javagda21.wzorce.behavioral.strategy;

public class Drukarka {

    private IFormaterCzcionki formaterCzcionki;

    public void setFormaterCzcionki(IFormaterCzcionki formaterCzcionki) {
        this.formaterCzcionki = formaterCzcionki;
    }

    public String reformat(String tekstDoPrzetworzenia) {
        // whaaaaaat? :) co tutaj ?
        return formaterCzcionki.zamienTekst(tekstDoPrzetworzenia);
    }
}
