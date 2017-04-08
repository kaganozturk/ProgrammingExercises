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
public class PalindromePrime {

	public static void main(String[] args) {

		int count = 0;
		int number = 0;
		while (count < 100) {
			if (PalindromeInteger.isPalindrome(number) && PrimeNumber.isPrime(number)) {
				if (count % 10 == 0) {
					System.out.println("");
				}
				System.out.print(number + " ");
				count++;

			}
			number++;
		}

	}

}
