package com.programs.interview;

public class Palindrome {
		
	public static void main(String args[])
	{
		String name="iTopiNonAvevAnoNipoTi";
		System.out.println(palindrome(name));
		
	}
	
	//Recursive method that verifies whether a string passed as a parameter is a palindrome
	public static boolean palindrome(String s) {
		  if (s.length() <= 1)
		    return true;
		  else
		    return (s.charAt(0) == s.charAt(s.length()-1)) &&
		            palindrome(s.substring(1,s.length()-1));// substring(int startIndex, int endIndex) -startIndex: inclusive endIndex: exclusive
		} 


}
