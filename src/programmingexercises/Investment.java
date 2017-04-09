/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercises;

import java.util.Scanner;

/**
 *
 * @author kagan
 */
public class Investment {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Investment amount : ");
		double a = scanner.nextDouble();
		System.out.print("Annual interest rate : % ");
		double b = scanner.nextDouble();
		System.out.println("Years	Future Value");
		System.out.println("---------------------------");
		for (int i = 1; i < 31; i++) {
			System.out.printf("%-8d%.2f%n", i, futureInvestmentValue(a, b / 100 / 12, i));

		}
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}

}
