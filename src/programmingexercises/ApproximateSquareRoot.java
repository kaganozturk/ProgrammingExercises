/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercises;

/**
 *
 * @author kagan
 */
public class ApproximateSquareRoot {

	public static void main(String[] args) {

		System.out.println(sqrt(454554454));

	}

	public static double sqrt(long n) {
		int step = 0;
		double guess = 1;
		double lastguess = 1;
		while (step < 50) {
			step++;
			guess = (guess + n / guess) * 0.5;
			if (Math.abs(guess - lastguess) < 0.0001) {
				System.out.println(step);
				return guess;
			}
			lastguess = guess;

		}
		return guess;
	}

}
