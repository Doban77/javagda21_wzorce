package com.javagda21.wzorce.creational.builder.Pieczatka;

public class Main {
    public static void main(String[] args) {

        Stamp.Builder builder = new Stamp.Builder();

        Stamp stamp = builder
                .setFirstDayNumber(0)
                .setSeconddayNumber(1)
                .setFirstMonthNumber(1)
                .setSecondMonthNumber(1)
                .setFirstYearNr(2)
                .setSecondYearNr(0)
                .setThirdYearNr(1)
                .setFourthYearNr(9)
                .setCaseNumber(1)
                .createStamp();

        System.out.println(stamp);
    }
}
