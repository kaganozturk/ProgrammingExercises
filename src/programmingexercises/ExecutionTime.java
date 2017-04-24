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
public class ExecutionTime {

	public static void main(String[] args) {

		int[] array = new int[10000];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10);
		}

		System.out.println(Arrays.toString(array));

		long startTime = System.nanoTime();
		System.out.println(linearSearh(array, -5));
		long executionTime = System.nanoTime() - startTime;
		System.out.println("linear search execution time : " + executionTime + " nano seconds");

		long startTime2 = System.nanoTime();
		System.out.println(binarySearch(array, -5));
		long executionTime2 = System.nanoTime() - startTime2;
		System.out.println("binary search execution time : " + executionTime2 + " nano seconds");

	}

	public static int linearSearh(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid]) {
				high = mid - 1;
			} else if (key == list[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}
		}
		return -low - 1;
	}
}
