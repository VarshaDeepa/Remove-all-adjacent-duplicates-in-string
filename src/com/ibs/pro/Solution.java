package com.ibs.pro;

public class Solution {
	public String removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder();
		int sbLength = 0;
		for (char character : s.toCharArray()) {
			if (sbLength != 0 && character == sb.charAt(sbLength - 1))
				sb.deleteCharAt(sbLength-- - 1);
			else {
				sb.append(character);
				sbLength++;
			}
		}
		System.out.println(sb.toString());
		return s;
	}
}
