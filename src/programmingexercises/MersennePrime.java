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
public class MersennePrime {

	public static void main(String[] args) {
		System.out.println("p		2^p - 1");
		System.out.println("____________________________");
		for (int i = 0; i < 32; i++) {
			if (PrimeNumber.isPrime((int) (Math.pow(2, i) - 1))) {
				System.out.printf("%-16d%d%n", i, (int) (Math.pow(2, i) - 1));
			}
		}
	}

}
