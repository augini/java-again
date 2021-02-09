package com.wcoding;

public class Main {
    public static void main(String[] args) {

        int principal = (int) Console.readNumber("Principal ($1K - $1M): ", 1000, 1000000);
        float annual_interest_rate = (float) Console.readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte) Console.readNumber("Period (Years): ",0,30);

        MortgageCalculator calculator = new MortgageCalculator(principal, annual_interest_rate, years);

        MortgageReport report = new MortgageReport(calculator);
        //display calculated mortgage rate
        report.printMortgage();
        //display monthly remaining payments
        report.printPaymentSchedule();
    }

}
