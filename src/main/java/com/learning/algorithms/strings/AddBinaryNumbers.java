package com.learning.algorithms.strings;

public class AddBinaryNumbers {
	
	public static void main(String[] args) {
		AddBinaryNumbers addBinaryNumbers = new AddBinaryNumbers();
		String num1 ="11001";
		String num2 = "11001";
		System.out.println("Result : "+addBinaryNumbers.addBinary(num1,num2));
	}

	public String addBinary(String num1, String num2) {
		String result = "";
		int l = num1.length()-1;
		int j = num2.length()-1;
		int sum = 0;
		while (l>=0 || j>=0 || sum==1) {
			
			sum+= (l>=0) ? num1.charAt(l) - '0': 0;
			sum+= (j>=0) ? num2.charAt(j) - '0': 0; 
			
			result = (char) (sum % 2 + '0' ) + result;
			sum/=2;
/*			if (sum>=2) {
				carry = 1;
				sum = 1;
				result = '0'+result;
			} else {
				result = sum+result;
				carry=0;
			}
			
*/			l--;j--;
		}
		
		return result;
		
	}

}
