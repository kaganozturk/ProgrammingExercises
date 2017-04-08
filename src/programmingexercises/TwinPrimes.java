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
public class TwinPrimes {

	public static void main(String[] args) {
		for (int i = 3; i < 1000; i += 2) {
			if (PrimeNumber.isPrime(i) && PrimeNumber.isPrime(i + 2)) {
				System.out.println("(" + i + "," + (i + 2) + ")");
			}
		}
	}

}
