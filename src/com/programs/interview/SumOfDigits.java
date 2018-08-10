package com.programs.interview;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12345;
		int sum=0;
		while(number!=0)
		{
			int remainder=number%10;
			sum=sum+remainder;
			number=number/10;
		}
		System.out.println("The Sum of digits are:" +sum);

	}

}
