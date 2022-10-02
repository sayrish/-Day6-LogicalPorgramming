package com.java.logicalprogramming;

import java.util.*;

public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = scanner.nextInt();
		int result=0;
		for(int i=1; i<=number/2; i++)
		{
			if(number % i == 0)
			{
				result = result + i;
			}
		}
		if( result == number)
			System.out.println("Number is Perfect.");
		else
			System.out.println("Number is not Perfect");
		
	}

}
