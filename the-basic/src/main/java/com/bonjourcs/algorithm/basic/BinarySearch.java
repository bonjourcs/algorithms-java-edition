package com.bonjourcs.algorithm.basic;

import java.util.Arrays;

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

		// sort array first
		Arrays.sort(a);

		int mid;
		while (low <= high) {
			// this works, 'mid = (high+low) / 2' may cause underlying bug
			// |> high+low could cause ArrayIndexOutOfBoundsException
			mid = low + ((high - low) >> 1);
//			mid = (low + high) >> 1;
			// this works, too
//			mid = (low + high) >>> 1;
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
