package com.bonjourcs.algorithm.basic;

/**
 * @author Liang Chenghao
 * Description: calculation on matrices.
 * Date: 2018/5/16
 */
public class MatrixCalculate {

	/**
	 * calculate the product of two matrices
	 *
	 * @param a matrix a
	 * @param b matrix b
	 * @return a*b
	 */
	public static int[][] calculate(int[][] a, int[][] b) {

		int row = a.length;
		int col = b.length;
		int[][] result = new int[row][row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				int sum = 0;
				for (int k = 0; k < col; k++) {
					sum += a[i][k] * b[k][j];
				}
				result[i][j] = sum;
			}
		}

		return result;
	}
}
