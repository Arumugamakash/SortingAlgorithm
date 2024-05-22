package com;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 4, 19, 3, 1, 4, 9, 7, 2, 8, 1 };
		System.out.println(Arrays.toString(selectionSort(arr)));
	}

	private static int[] selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];// 4
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {// 7<4 2<4 8<2
					int temp = arr[j];// 1
					arr[j] = min;// 2
					min = temp;// 1
					arr[i] = min;
				}
			}
		}
		return arr;
	}

}
