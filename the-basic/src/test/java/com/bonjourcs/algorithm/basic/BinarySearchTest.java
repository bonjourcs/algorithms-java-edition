package com.bonjourcs.algorithm.basic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2018/5/16
 */
public class BinarySearchTest {

	@Test
	public void testSearch() {

		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		Assert.assertEquals(4, BinarySearch.search(a, 5));
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8};
		Assert.assertEquals(-1, BinarySearch.search(b, 10));
		int[] c = {1, 2, 3, 4, 5, 6, 7};
		Assert.assertEquals(3, BinarySearch.search(c, 4));
		int[] d = {1, 2, 3, 4, 5, 6, 7};
		Assert.assertEquals(-1, BinarySearch.search(d, 8));

	}
}