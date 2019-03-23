package com.javagda21.wzorce.creational.builder.Pieczatka;

public class Stamp {

    private int firstDayNumber, seconddayNumber, firstMonthNumber, secondMonthNumber, firstYearNr, secondYearNr,
            thirdYearNr, fourthYearNr;

    private int caseNumber;

    public Stamp(int firstDayNumber, int seconddayNumber, int firstMonthNumber, int secondMonthNumber, int firstYearNr,
                 int secondYearNr, int thirdYearNr, int fourthYearNr, int caseNumber) {
        this.firstDayNumber = firstDayNumber;
        this.seconddayNumber = seconddayNumber;
        this.firstMonthNumber = firstMonthNumber;
        this.secondMonthNumber = secondMonthNumber;
        this.firstYearNr = firstYearNr;
        this.secondYearNr = secondYearNr;
        this.thirdYearNr = thirdYearNr;
        this.fourthYearNr = fourthYearNr;
        this.caseNumber = caseNumber;
    }

    public static class Builder{


        private int firstDayNumber;
        private int seconddayNumber;
        private int firstMonthNumber;
        private int secondMonthNumber;
        private int firstYearNr;
        private int secondYearNr;
        private int thirdYearNr;
        private int fourthYearNr;
        private int caseNumber;

        public Builder setFirstDayNumber(int firstDayNumber) {
            this.firstDayNumber = firstDayNumber;
            return this;
        }

        public Builder setSeconddayNumber(int seconddayNumber) {
            this.seconddayNumber = seconddayNumber;
            return this;
        }

        public Builder setFirstMonthNumber(int firstMonthNumber) {
            this.firstMonthNumber = firstMonthNumber;
            return this;
        }

        public Builder setSecondMonthNumber(int secondMonthNumber) {
            this.secondMonthNumber = secondMonthNumber;
            return this;
        }

        public Builder setFirstYearNr(int firstYearNr) {
            this.firstYearNr = firstYearNr;
            return this;
        }

        public Builder setSecondYearNr(int secondYearNr) {
            this.secondYearNr = secondYearNr;
            return this;
        }

        public Builder setThirdYearNr(int thirdYearNr) {
            this.thirdYearNr = thirdYearNr;
            return this;
        }

        public Builder setFourthYearNr(int fourthYearNr) {
            this.fourthYearNr = fourthYearNr;
            return this;
        }

        public Builder setCaseNumber(int caseNumber) {
            this.caseNumber = caseNumber;
            return this;
        }

        public Stamp createStamp() {
            return new Stamp(firstDayNumber, seconddayNumber, firstMonthNumber, secondMonthNumber, firstYearNr, secondYearNr, thirdYearNr, fourthYearNr, caseNumber);
        }
    }

    @Override
    public String toString() {
        return " " + firstDayNumber +
                + seconddayNumber +
                "." + firstMonthNumber +
                + secondMonthNumber +
                "." + firstYearNr +
                 secondYearNr +
                thirdYearNr +
                fourthYearNr + " "
                + caseNumber
                ;
    }
}
