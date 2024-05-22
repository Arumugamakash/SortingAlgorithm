package com;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 9, 8, 1, 2, 4 };
		System.out.println(Arrays.toString(insertionSort(arr)));
	}

	private static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int sort = arr[i];// 8
			int j = i - 1;// 1
			while (j >=  0 && arr[j] > sort) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = sort;
		}

		return arr;
	}

}
