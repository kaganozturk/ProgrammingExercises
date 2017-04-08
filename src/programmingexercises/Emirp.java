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
public class Emirp {

	public static void main(String[] args) {

		int count = 0;
		int number = 0;
		while (count < 100) {
			if (PrimeNumber.isPrime(number) && PrimeNumber.isPrime(PalindromicPrime.reverse(number)) && !PalindromeInteger.isPalindrome(number)) {
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
