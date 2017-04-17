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
public class CountDistincts {

	public static void main(String[] args) {

		Random random = new Random();
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = random.nextInt(10);
		}
		System.out.println(Arrays.toString(array));
		countDistincts(array);

	}

	public static void countDistincts(int[] array) {
		int count = 0;
		boolean distinct;
		int[] distinctArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			distinct = true;
			for (int j = 0; j < 10; j++) {
				if (array[i] == array[j] && i != j) {
					distinct = false;
					break;
				}
			}
			if (distinct) {
				distinctArray[count] = array[i];
				count++;
			}
		}
		System.out.println(count);
		System.out.print("distinct numbers : ");
		for (int i = 0; i < count; i++) {
			System.out.print(distinctArray[i] + " ");
		}
		System.out.println("");
	}

}
