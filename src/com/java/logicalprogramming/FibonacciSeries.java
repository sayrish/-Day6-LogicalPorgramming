package com.java.logicalprogramming;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a Number: ");
			int size = sc.nextInt();
			int num1=0, num2 = 1;
			int num3;
			//print 0 and 1 here..
			
			System.out.println("Fibonacci Series of: "+size);
			System.out.print(num1+" "+num2);
			for(int i=2; i<=size; i++)
			{	
				//adding 0+1
				num3 = num1 + num2;
				
				System.out.print(" "+num3);
				//swapping values
				num1 = num2;
				num2 = num3;
			}
		}
	}	
}