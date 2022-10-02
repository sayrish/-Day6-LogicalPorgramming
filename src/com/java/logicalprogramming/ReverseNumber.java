package com.java.logicalprogramming;

import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = s.nextInt();
		System.out.println("Original Number: "+number);
		int rev=0, rem;
		while(number != 0)
		{
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10 ;
		}
		System.out.println("Reversed Number: "+rev);
	}
}
