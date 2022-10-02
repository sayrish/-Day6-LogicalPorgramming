package com.java.logicalprogramming;

import java.util.*;

public class TemperatureConversion {
	static float temperatureConversion(char unit, float value) {
		float unitFahreniteCelsius = 0;
		switch (unit) {
		case 'C':
			unitFahreniteCelsius = (value * 9 / 5) + 32;
			break;
		case 'F':
			unitFahreniteCelsius = (value - 32) * 5 / 9;
			break;
		default:
			System.out.println("Invalid Unit: Please enter either 'C' or 'F' only!");
		}

		return unitFahreniteCelsius;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 'C' for celsius \tEnter 'F' for fahrenhiet");
		System.out.print("Enter temperature unit: ");
		char unit = scanner.next().charAt(0);

		System.out.println("Entered temperature value: ");
		float value = scanner.nextFloat();

		float convertedValue = temperatureConversion(unit, value);

		switch (unit) {
		case 'C':
			System.out.println(value + "C = " + convertedValue + "F");
			break;
		case 'F':
			System.out.println(value + "F = " + convertedValue + "C");
		}

	}
	
}
