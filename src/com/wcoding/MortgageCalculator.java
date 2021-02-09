package com.wcoding;

import java.text.NumberFormat;
import java.util.Locale;

public class MortgageCalculator {
    final private byte MONTHS_IN_YEAR = 12;
    final private byte PERCENT = 100;

    private int principal;
    private float annual_interest_rate;
    private byte years;

    public MortgageCalculator(int principal, float annual_interest_rate, byte years){
        this.annual_interest_rate = annual_interest_rate;
        this.principal = principal;
        this.years = years;
    }

    //get calculated mortgage
    public double calculateMortgage(){
        // format the values
        float monthlyInterest = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();

        // calculate the mortgage
        double top = (float)Math.pow(1+monthlyInterest,  numberOfPayments);
        top = top* monthlyInterest;
        double bottom = Math.pow(monthlyInterest+1,numberOfPayments) - 1 ;

        return principal * (top/bottom);
    }

    //get remaining balance after a single payment
    public double calculateBalance(short numberOfPaymentsMade){
        // format the values
        float monthlyInterest = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();

        //get the constant value
        return principal * (((float)Math.pow(1+monthlyInterest,  numberOfPayments) - (float)Math.pow(1+monthlyInterest,  numberOfPaymentsMade)) /
                ((float)Math.pow(1+monthlyInterest,  numberOfPayments)-1));
    }

    public  double[] getRemainingBalances(){
        short counter = 1;
        double[] balances = new double[getNumberOfPayments()];

        while(counter <= balances.length) {
            balances[counter-1]= calculateBalance(counter);
            counter++;
        }

        return balances;
    };

    private float getMonthlyInterest() {
        return annual_interest_rate / PERCENT / MONTHS_IN_YEAR;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }
}
