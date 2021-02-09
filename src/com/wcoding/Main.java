package com.wcoding;

import java.awt.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // get validated principal
        int principal = (int)readNumber("Principal ($1K - $1M): ", 1000, 1000000);

        // get validated annual interest rate
        float annual_interest_rate = (float)readNumber("Annual Interest Rate: ", 0, 30);

        // get validated period length
        byte years = (byte) readNumber("Period (Years): ",0,30);

        //get calculated mortgage
        double mortgage = calculateMortgage(principal, annual_interest_rate, years);
        System.out.println("\nMORTGAGE\n------------");
        System.out.println("Monthly payments: " + NumberFormat.getCurrencyInstance(Locale.US).format(mortgage));

        //display monthly remaining payments
        displayMonthlyRemainingPayments(principal, annual_interest_rate, years);

    }

    //read the number
    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;

        while(true){
            System.out.print(prompt);
            value = scanner.nextFloat();

            if(value >= min && value <= max) break;
            System.out.println("Enter a value between" + min + " and " + max);
        }

        return value;

    }

    //calculate mortgage
    public static double calculateMortgage(int principal, float annual_interest_rate, byte years ){
        // format the values
        float monthlyInterest = (annual_interest_rate / PERCENT) / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        // calculate the mortgage
        double top = (float)Math.pow(1+monthlyInterest,  numberOfPayments);
        top = top* monthlyInterest;
        double bottom = Math.pow(monthlyInterest+1,numberOfPayments) - 1 ;

        return principal * (top/bottom);

    }

    //calculate monthly remaining payment
    public static double getRemainingBalance(int principal, float annual_interest_rate, byte years, int numberOfPaymentsMade ){

        // format the values
        float monthlyInterest = (annual_interest_rate / PERCENT) / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        //get the constant value
        return principal * (((float)Math.pow(1+monthlyInterest,  numberOfPayments) - (float)Math.pow(1+monthlyInterest,  numberOfPaymentsMade)) /
                ((float)Math.pow(1+monthlyInterest,  numberOfPayments)-1));
    }

    //display monthly remaining payments
    public static void displayMonthlyRemainingPayments(int principal, float annual_interest_rate, byte years){
        int counter = 1;

        System.out.println("\nPAYMENT SCHEDULE\n-------------");
        while(counter <= years* 12) {
            double balance = getRemainingBalance(principal,annual_interest_rate,years,counter);
            System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(balance));
            counter++;
        }
    }

}
