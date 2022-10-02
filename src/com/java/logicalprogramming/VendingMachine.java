package com.java.logicalprogramming;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount: ");
		int amount = sc.nextInt();
		int currency[] = new int[]{1000,500,100,10,5,2,1};
		int index = 0;
		while(amount != 0)
		{
			int noteCounter = 0 ;
			System.out.println("Amount Left: "+amount);
			while(amount >= currency[index])
			{
				amount = amount - currency[index];
				noteCounter++;
				
			}
			System.out.println(currency[index]+" * "+noteCounter);
			index++;
		}
	

	}

}
