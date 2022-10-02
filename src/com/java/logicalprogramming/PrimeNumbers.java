package com.java.logicalprogramming;

import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = sc.nextInt();
		boolean isPrime=true;
		for(int i=0; i<number/2; i++)
		{
			if(number % 2 == 0)
			{
				isPrime = false;
			}
		}
		if(isPrime == true )
			System.out.println(number+" is Prime");
		else
			System.out.println(number+ " is Not Prime");		

	}

}
