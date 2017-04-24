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
public class BubbleSort {

	public static void main(String[] args) {

		double[] array = new double[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextDouble() * 10;
		}
		System.out.println(Arrays.toString(array));
		bubbleSort(array);
		System.out.println(Arrays.toString(array));

	}

	public static void bubbleSort(double[] array) {
		double temp;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sorted = false;
				}
			}
		}
	}

}
