package com.wcoding;

import com.wcoding.exceptions.Account;
import com.wcoding.exceptions.ExceptionsDemo;
import com.wcoding.exceptions.InsufficientFundsException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ExceptionsDemo.show();
        Account account = new Account();

        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

//      TextBox textBox = new TextBox(true, "Hello");
//
//        Point point1 = new Point(1,2);
//        Point point2 = new Point(1,2);
//        System.out.println(point1.equals(point2));

//      int principal = (int) Console.readNumber("Principal ($1K - $1M): ", 1000, 1000000);
//      float annual_interest_rate = (float) Console.readNumber("Annual Interest Rate: ", 0, 30);
//      byte years = (byte) Console.readNumber("Period (Years): ",0,30);
//
//      MortgageCalculator calculator = new MortgageCalculator(principal, annual_interest_rate, years);
//
//      MortgageReport report = new MortgageReport(calculator);
//      //display calculated mortgage rate
//      report.printMortgage();
//      //display monthly remaining payments
//      report.printPaymentSchedule();

    }

}
