package org.java.lessons;

import java.util.Random;

public class Snack_11 {
	public static void main(String[] args) {
		final int VALUE_COUNT = 15;
		
		Random rnd = new Random();
		
		int[] rndNumArray = new int[VALUE_COUNT];
		
		System.out.print("i numeri estratti sono: ");
		for(int x=0; x<rndNumArray.length; x++) {
			rndNumArray[x]= rnd.nextInt(0,101);
			System.out.print(rndNumArray[x] + " - ");
		}
		
		//valore minimo
		int minValue = Integer.MAX_VALUE;
		for(int x=0; x<rndNumArray.length; x++) {
			int value = rndNumArray[x];
			if(value < minValue) {
				minValue = value;
			}
		}
		
		//valore massimo
		int maxValue = Integer.MIN_VALUE;
		for(int x=0; x<rndNumArray.length; x++) {
			int value = rndNumArray[x];
			if(value>maxValue) {
				maxValue = value;
			}
		}
		
		//media
		int avgValue = 0;
		for(int x=0; x<rndNumArray.length; x++) {
			int value = rndNumArray[x];
			avgValue += value;
		}
		avgValue /= rndNumArray.length;
		
		System.out.println("\n"+"il valore minimo estratto e': " + minValue);
		System.out.println("il valore massimo estratto e': " + maxValue);
		System.out.println("la media dei valori estratti e': " + avgValue);

	}
}
