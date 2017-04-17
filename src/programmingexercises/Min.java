/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercises;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author kagan
 */
public class Min {

	public static void main(String[] args) {

		Random random = new Random();
		double[] array = new double[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextDouble() * 10;
		}
		System.out.println(Arrays.toString(array));
		System.out.println("min : " + min(array));
	}

	public static double min(double[] array) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

}
