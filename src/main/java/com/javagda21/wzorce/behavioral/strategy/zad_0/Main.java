package com.javagda21.wzorce.behavioral.strategy.zad_0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Drukarka drukarka = new Drukarka();

        boolean isRunning = true;

        while (isRunning) {
            String line = scanner.nextLine();

            String[] words = line.split(" ", 2);

            if (line.startsWith("change")) {
                // wpisujemy komendę change na zmianę formattera, po change piszemy nazwę parsera

                String parserType = words[1];
                if (parserType.equalsIgnoreCase("upper")) {
                    drukarka.setFormaterCzcionki(new UpperFormatter());
                } else if (parserType.equalsIgnoreCase("lower")) {
                    drukarka.setFormaterCzcionki(new LowerFormatter());
                } else if (parserType.equalsIgnoreCase("inverter")) {
                    drukarka.setFormaterCzcionki(new InverterFormatter());
                } else if (parserType.equalsIgnoreCase("trim")) {
                    drukarka.setFormaterCzcionki(new TrimFormatter());
                } else if (parserType.equalsIgnoreCase("splitter")) {
                    drukarka.setFormaterCzcionki(new SplitterFormatter());
                }

            } else if (line.startsWith("parse")) {
                // wpisujemy komendę parse do przetworzenia tekstu, po słowie parse występuje tekst do przetworzenia.

                String tekstDoPrzetworzenia = words[1];

                drukarka.reformat(tekstDoPrzetworzenia);

            } else if (line.startsWith("quit")) {
                isRunning = false;
            }
        }
    }
}