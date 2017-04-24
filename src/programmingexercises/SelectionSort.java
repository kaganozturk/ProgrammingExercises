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
public class SelectionSort {

	public static void main(String[] args) {

		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(100);
		}
		System.out.println(Arrays.toString(array));
		selectionSort(array);
		System.out.println(Arrays.toString(array));

	}

	public static void selectionSort(int[] array) {
		int maxIndex;
		for (int i = array.length - 1; i > 0; i--) {
			maxIndex = i;
			for (int j = i - 1; j > -1; j--) {
				if (array[maxIndex] < array[j]) {
					maxIndex = j;
				}
			}
			if (i != maxIndex) {
				int temp = array[i];
				array[i] = array[maxIndex];
				array[maxIndex] = temp;
			}

		}
	}

}
