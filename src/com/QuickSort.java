package com;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int a[] = { 9, 7, 5, 14, 2, 3, 6, 10 };
		quickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	private static void quickSort(int[] a, int l, int h) {
		if (l >= h) {
			return;
		}
		int start = l, end = h;
		int mid = (l + h) / 2;
		int pivot = a[mid];// 14
		while (start <= end) {
			while (a[start] < pivot) {
				start++;
			}
			while (a[end] > pivot) {
				end--;
			}
			if (start <= end) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
		}
		quickSort(a, l, end);
		quickSort(a, start, h);
	}
}
