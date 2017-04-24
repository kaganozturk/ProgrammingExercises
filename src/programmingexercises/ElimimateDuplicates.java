/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercises;

import java.util.Random;

/**
 *
 * @author kagan
 */
public class ElimimateDuplicates {

	public static void main(String[] args) {

		int[] array = new int[10000000];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(50);
		}
		eliminateDuplicates(array);
		System.out.println("");

	}

	public static int[] eliminateDuplicates(int[] numbers) {
		boolean same;
		int distinctCount = 0;
		int[] distincts = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			same = false;
			for (int j = 0; j < distinctCount; j++) {
				if (numbers[i] == distincts[j]) {
					same = true;
					break;
				}
			}
			if (!same) {
				distincts[distinctCount] = numbers[i];
				distinctCount++;
			}

		}
		for (int i = 0; i < distinctCount; i++) {
			System.out.print(distincts[i] + " ");
		}
		System.out.println("");
		System.out.println("distinc count : " + distinctCount);

		return distincts;
	}
}
