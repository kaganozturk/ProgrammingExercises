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
public class StandardDeviation {

	public static void main(String[] args) {

		Random random = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}
		System.out.println(Arrays.toString(array));
		System.out.println("mean : " + mean(array));
		System.out.println("standard deviation : " + deviation(array));

	}

	public static double mean(int[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

	public static double deviation(int[] array) {
		double mean = mean(array);
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += Math.pow(array[i] - mean, 2);
		}
		return Math.pow(sum / array.length, 0.5);
	}

}
