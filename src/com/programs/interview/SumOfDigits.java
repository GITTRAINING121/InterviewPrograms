package com.programs.interview;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1;
		System.out.println("The Sum of digits are:"+ sumOfDigits(number));
	}
		
	//sum of digit through recursion
	public static int sumOfDigits(int num)
		{
			if(num==0)
				return 0;
				else
					return (num%10+sumOfDigits(num/10));
		}
	}

