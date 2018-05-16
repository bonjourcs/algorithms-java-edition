package com.bonjourcs.algorithm.basic;

/**
 * @author Liang Chenghao
 * Description: a binary search algorithm
 * Date: 2018/5/16
 */
public class BinarySearch {

	/**
	 * search key in array a
	 *
	 * @param a   array to search
	 * @param key flag
	 * @return if find key in array, return index of key, otherwise, return -1
	 */
	public static int search(int[] a, int key) {

		int low = 0;
		int high = a.length - 1;

		int mid;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (a[mid] == key) {
				return mid;
			} else if (a[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}
}
