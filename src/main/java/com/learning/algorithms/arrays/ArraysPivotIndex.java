package com.learning.algorithms.arrays;

/**
 * @author achark
 * 
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
 * 
 * We define the pivot index as the index where the sum of the numbers to the left of the index is equal 
 * to the sum of the numbers to the right of the index.
 * 
 * 
 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 * 
 * 
 * Example 1:
 * Input: 
 * nums = [1, 7, 3, 6, 5, 6]
 * Output: 3
 * Explanation: 
 * The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
 * Also, 3 is the first index where this occurs.
 *  
 * 
 * Example 2:
 * 
 * Input: 
 * nums = [1, 2, 3]
 * Output: -1
 * Explanation: 
 * There is no index that satisfies the conditions in the problem statement.
 *  
 * 
 * Note:
 * 
 * The length of nums will be in the range [0, 10000].
 * Each element nums[i] will be an integer in the range [-1000, 1000].
 * 
 *
 */
public class ArraysPivotIndex {
	
	/**
	 * @param nums
	 * @return
	 * Use two loops. Outer loop iterates through all the element and inner loop finds out whether 
	 * the current index picked by the outer loop is equilibrium
	 *  index or not. Time complexity of this solution is O(n^2).
	 */
	public int findPivotIndexApproach1(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			int sumLeft = 0;
			int sumRight = 0;
			
			//calculate left sum
			for (int x=0; x<=i; x++) {
				sumLeft = sumLeft + nums[x];
			}
			
			//calculate right sum
			for (int y=i; y<nums.length; y++) {
				sumRight = sumRight + nums[y];
			}
			
			//compare
			if (sumLeft==sumRight) {
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * @param nums
	 * @return
	 * 
	 * The idea is to get total sum of array first. 
	 * Then Iterate through the array and keep updating the left sum which is initialized as zero. 
	 * In the loop, we can get right sum by subtracting the elements one by one. 
	 * Time Complexity: O(n)
	 */
	public int findPivotIndexApproach2(int[] nums) {
		int sum = 0;
		int sumLeft = 0;
		for(int i=0; i<nums.length; i++) {
			sum = sum+nums[i];
		}

		for(int i=0; i<nums.length; i++) {			
			//calculate right sum
			sum = sum - nums[i];
			
			//compare
			if (sumLeft==sum) {
				return i;
			}
			// calculate left sum
			sumLeft = sumLeft + nums[i];

		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int [] i = {5,4,3,6,4,3,5};
		ArraysPivotIndex pIndex = new ArraysPivotIndex();
		System.out.println("PivotIndex for arryay i = " +" is " + pIndex.findPivotIndexApproach2(i));
	}

}
