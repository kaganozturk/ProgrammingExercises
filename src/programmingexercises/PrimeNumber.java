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
public class PrimeNumber {

	public static void main(String[] args) {

		for (int i = 0; i < 10000; i++) {

			if (isPrime(i)) {

				System.out.println(i);

			}

		}

	}

	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= number; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
