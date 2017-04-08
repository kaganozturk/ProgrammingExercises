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
public class PalindromicPrime {

	public static void main(String[] args) {
		int count = 0;
		int number = 0;
		while (count < 100) {
			if (PrimeNumber.isPrime(number) && isPalindrome(number)) {
				if (count % 10 == 0) {
					System.out.println("");
				}
				System.out.print(number + " ");
				count++;
			}
			number++;
		}
	}

	static int reverse(int number) {
		int reversedNumber = 0;
		while (number > 0) {
			reversedNumber = reversedNumber * 10 + number % 10;
			number /= 10;
		}
		return reversedNumber;

	}

	static boolean isPalindrome(int number) {
		return number == reverse(number);
	}

}
