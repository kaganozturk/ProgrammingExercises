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
public class ReverseArray {

	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = new Random().nextInt(20);
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(reverse(array)));
	}

	public static int[] reverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			array = swap(array, i);
		}
		return array;
	}

	public static int[] swap(int[] array, int i) {
		int temp = array[i];
		array[i] = array[array.length - 1 - i];
		array[array.length - 1 - i] = temp;
		return array;
	}

}
