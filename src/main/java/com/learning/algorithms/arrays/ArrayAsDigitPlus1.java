package com.learning.algorithms.arrays;

import java.util.Arrays;

/**
 * @author achark
 *
 * Adding one to number represented as array of digits
 * Given a non-negative number represented as an array of digits, add 1 to the number 
 * ( increment the number represented by the digits ). The digits are stored such that the most significant digit is first element of array.

 * Examples :

 * Input : [1, 2, 4]
 * Output : [1, 2, 5]

 * Input : [9, 9, 9]
 * Output : [1, 0, 0, 0]
 */
public class ArrayAsDigitPlus1 {
	
	/**
	 * @param nums
	 * @return
	 * 
	 * AApproach :
	 * 1. Add 1 to the last element of the array, if it is less than 9.
	 * 2. If it is 9, then make it 0 and recurse for the remaining element of the array.
	 */
	public int[] arrayAsDigitPlus1(int[] nums) {
		for (int i=0; i < nums.length; i++) {
			int lastNumber = nums[nums.length -1 - i];
			System.out.println("last : "+lastNumber);
			if (lastNumber < 9) {
				nums[nums.length -1 - i] = lastNumber + 1;
				return nums;
			} else if ((i==nums.length-1) && lastNumber==9) {
				nums[nums.length -1 - i] = 0;
				return appendElementInStartofArray(nums);
			} else {
				nums[nums.length -1 - i] = 0;
			}
		}
		return nums;
	}
	
	private int[] appendElementInStartofArray(int[] nums) {
		int[] newArray = new int[nums.length+1];
		newArray[0] = 1;
		for (int i=1; i<newArray.length; i++) {
			newArray[i] = nums[i-1];
		}
		return newArray;
	}
	

	public static void main(String[] args) {
		int [] num = {9,9,9,9,9};
		//int [] num = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
		ArrayAsDigitPlus1 arrayAsDigitPlus1 = new ArrayAsDigitPlus1();
		System.out.println("arrayAsDigitPlus1 :" + Arrays.toString(arrayAsDigitPlus1.arrayAsDigitPlus1(num)));
	}

}
