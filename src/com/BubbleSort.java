package com;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 4, 19, 3, 1, 4, 9, 7, 2, 8, 1 };
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	private static int[] bubbleSort(int[] arr) {
		boolean b ;
		do {
			b=false;
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {//4>19
					b = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		} while (b);

		return arr;
	}
}
