package com.learning.algorithms.strings;

import java.util.Arrays;

public class FindStringIndex {
	
	public int strIndex(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;
        return haystack.indexOf(needle);
        
    }
	
	public String longestCommonPrefix(String[] str) {
	      //sort the input array.
			Arrays.sort(str);
			int length = str.length;
			String result = "";
	        if (length==0) 
	            return result;
	        if (str.length==1)
	            result = str[0];
	        else
			    result = commonPrefix(str[0], str[length-1]);
			return result;
		}
		
		private String commonPrefix(String input1, String input2) {
			int s1 = input1.length();
			int s2 = input2.length();
			String result = "";

			for (int i=0, j=0; i<=s1-1 && j<=s2-1;i++,j++) {
				if(input1.charAt(i)!=input2.charAt(j))
					break;
				result+=input1.charAt(i);
			}
			return result;
		}
	public static void main(String[] args) {
		FindStringIndex findStringIndex = new FindStringIndex();
		
		System.out.println("Index is " + findStringIndex.strIndex("Hello", "ll"));
		
		String [] str = {"hello", "heman", "heram"};
		System.out.println("longestCommonPrefex : " + findStringIndex.longestCommonPrefix(str));
		
		
	}

}
