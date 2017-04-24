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
public class IsSorted {

	public static void main(String[] args) {
		int[] array = new int[3];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10);
		}
		System.out.println(Arrays.toString(array));
		System.out.println("isSorted : " + isSorted(array));
	}

	public static boolean isSorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
