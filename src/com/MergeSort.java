package com;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = { 9, 4, 2, 8, 5, 1, 7, 6 };
		arr = mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] mergeSort(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}
		int middle = arr.length / 2;
		int left[] = mergeSort(Arrays.copyOfRange(arr, 0, middle));
		int right[] = mergeSort(Arrays.copyOfRange(arr, middle, arr.length));
		return merge(left, right);

	}

	private static int[] merge(int[] left, int[] right) {
		System.out.println("hi");
		int merge[] = new int[left.length + right.length];
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				merge[k++] = left[i++];
			} else {
				merge[k++] = right[j++];
			}
		}
		while (i < left.length)
			merge[k++] = left[i++];
		while (j < right.length)
			merge[k++] = right[j++];
		return merge;
	}

}
