package com.learning.algorithms.twodarrays;

import java.util.ArrayList;
import java.util.List;

public class MatrixTraversal {

	public static void main(String[] args) {
		int col = 5;
		int row = 3;
		int [][] matrix = 	{	{1,2,3,4,5},
								{6,7,8,9,10},
								{11,12,13,14,15}
							};
		
		MatrixTraversal traverse = new MatrixTraversal();
		
		System.out.println("...... Print ZigZag ......\n");
		List<Integer> result = traverse.printZigZag(matrix, row, col);
		System.out.println(result);
		
		System.out.println("...... Print Pascal Triangle ......\n");
		
	}

	/**
	 * @param matrix
	 * @param row
	 * @param col
	 * @return
	 * 
	 * Given a 2D array, print it in zigzag form.
	 * Examples :

	 * Input : 
	 *         1    2   3   4   5
	 *         6    7   8   9   10
	 *         11   12  13  14  15
	 *         16  17  18  19   20
	 * Output :
	 * 1 2 3 4 5 10 9 8 7 6 11 12 13 14 15 20 19 18 17 16 
	 * 
	 * 
	 * Input :
	 *         10    24   32   
	 *         50    6    17   
	 *         99    10   11  
         
	 * Output :
	 * 10 24 32 17 6 50 99 10 11
	 */
	public List<Integer> printZigZag(int[][] matrix, int row, int col) {
		int evenRow = 0;
		int oddRow = 1;
		ArrayList<Integer> resultArray = new ArrayList<Integer>();
		while (evenRow < row) {
			for (int i=0;i<col;i++) {
				System.out.println(matrix[evenRow][i]);
				resultArray.add(matrix[evenRow][i]);
			}

			evenRow = evenRow +2;
			
			if (oddRow < row) {
				for (int i=col-1; i>=0; i--) {
					System.out.println(matrix[oddRow][i]);
					resultArray.add(matrix[oddRow][i]);
				}
				oddRow = oddRow + 2;
			}
		}
		return resultArray;
	}
}
