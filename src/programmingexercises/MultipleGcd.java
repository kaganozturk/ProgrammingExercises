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
public class MultipleGcd {

	public static void main(String[] args) {

		int[] array = {90, 180, 120, 90, 270};
		System.out.println(gcd(array));

	}

	public static int gcd(int... numbers) {
		int min = min(numbers);
		boolean check;
		for (int i = min; i > 1; i--) {
			check = true;
			for (int number : numbers) {
				if (number % i != 0) {
					check = false;
					break;
				}
			}
			if (check) {
				return i;
			}
		}
		return 1;
	}

	public static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

}
