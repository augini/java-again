package com.wcoding;

import java.text.NumberFormat;
import java.util.Locale;

public class MortgageReport {
    private final NumberFormat currencyInstance;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
    }

    public void printPaymentSchedule(){
        System.out.println("\nPAYMENT SCHEDULE\n-------------");
        for(double balance: calculator.getRemainingBalances()){
            System.out.println(currencyInstance.format(balance));
        }
    }

    public void printMortgage(){
        System.out.println("\nMORTGAGE\n------------");
        System.out.println("Monthly payments: " + currencyInstance.format(calculator.calculateMortgage()));
    }
}
