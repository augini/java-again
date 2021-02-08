package com.wcoding;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        //get principal
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        //get annual interest rate
        System.out.print("Annual Interest Rate: ");
        float annual_interest_rate = scanner.nextFloat();
        float monthlyInterest = (annual_interest_rate / PERCENT) / MONTHS_IN_YEAR;

        //get period length
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        //calculate mortgage
        float top = (float)Math.pow(1+annual_interest_rate,  numberOfPayments);
        top = top* annual_interest_rate;
        double bottom = Math.pow(annual_interest_rate+1,numberOfPayments) - 1 ;

        double mortgage = principal * (top/bottom);

        //convert to the currency format
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result =  currency.format(mortgage);

        System.out.println("Mortgage: " + result);
    }
}
