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
        double top = (float)Math.pow(1+monthlyInterest,  numberOfPayments);
        top = top* monthlyInterest;
        double bottom = Math.pow(monthlyInterest+1,numberOfPayments) - 1 ;

        double mortgage = principal * (top/bottom);
        System.out.println(mortgage);

        //convert to the currency format
       String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

       System.out.println(mortgageFormatted);
    }
}
