package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the loan: ");
        double loans = scanner.nextDouble();
        double interest_rate = 0.075;
        System.out.print("Input the month: ");
        double months = scanner.nextDouble();
        double range;

        double capital = loans/months;
        System.out.println("Principal pay in " + months + " months: "+ capital);

        range = 0;
        double first_year_interest = calculateInterest(loans, interest_rate, range);
        System.out.println("First year interest: " + first_year_interest);

        range = 0.035;
        double next_year_interest = calculateInterest(loans, interest_rate, range);
        System.out.println("Next year interest: " + next_year_interest);

        System.out.println("Monthly amount paid in the first year: " + (capital + first_year_interest));

        System.out.println("Monthly amount paid in the next year: " + (capital + next_year_interest));
    }

    public static double calculateInterest(double loans, double interest_rate, double range){
        return loans * ((interest_rate + range)/12);
    }
}
