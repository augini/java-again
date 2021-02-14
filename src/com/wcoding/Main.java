package com.wcoding;

public class Main {
    public static void main(String[] args) {
        TaxCalculator2018 taxCalculator2018 = new TaxCalculator2018(100_000);
        TaxReport taxReport = new TaxReport(taxCalculator2018);
        taxReport.show();

        taxReport.setCalculator(new TaxCalculator2019());
        taxReport.show();

//        TextBox textBox = new TextBox(true, "Hello");
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
