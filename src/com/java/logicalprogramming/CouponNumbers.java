package com.java.logicalprogramming;

import java.util.*;

public class CouponNumbers {

	public static boolean isPresent(int a[], int num) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("how many random numbers do you\r\n" + "need to generate a distinct coupon number?");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int randomNum = 0;
		int arr[] = new int[size];
		Random coupon = new Random();
		boolean return1;

		for (int i = 0; i < arr.length; i++) {
			randomNum = coupon.nextInt(20);
			return1 = isPresent(arr, randomNum);
			if (return1 != true) {
				arr[i] = randomNum;
			} else {
				--i;
			}
		}

		/*
		 * arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50;
		 * System.out.println(isPresent(arr, 20));
		 */
		System.out.println("The random numbers generated are ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		

	}

}
