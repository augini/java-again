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
        int principal;

        // validate principal
        while(true){
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();

            if(principal >= 1000 && principal <= 1000000){
                break;
            } else {
                System.out.println("Enter a number between 1,000 and 1,000,000");
                continue;
            }
        }

        //get annual interest rate
        float annual_interest_rate;

        // validate annual interest rate
        while(true){
            System.out.print("Annual Interest Rate: ");
            annual_interest_rate = scanner.nextFloat();

            if(annual_interest_rate > 0 && annual_interest_rate <= 30){
                break;
            }else {
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
                continue;
            }
        }

        float monthlyInterest = (annual_interest_rate / PERCENT) / MONTHS_IN_YEAR;

        //get period length
        byte years;

        // validate period length
        while(true){
            System.out.print("Period (Years): ");
            years = scanner.nextByte();

            if(years > 0 && years <= 30){
                break;
            }else{
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
                continue;
            }
        }
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
