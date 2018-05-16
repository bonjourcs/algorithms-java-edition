package com.bonjourcs.algorithm.basic;

import org.junit.Test;

/**
 * @author Liang Chenghao
 * Description:
 * Date: 2018/5/16
 */
public class MatrixCalculateTest {

	@Test
	public void testCalculate() {

		int[][] a = {{10, 6}, {3, 9}, {6, 7}};
		int[][] b = {{1, 9, 5}, {4, 10, 6}};

		int[][] result = MatrixCalculate.calculate(a, b);
		System.out.println("The result: ");
		for (int[] aResult : result) {
			for (int anAResult : aResult) {
				System.out.print(anAResult + "\t");
			}
			System.out.println();
		}

	}
}
