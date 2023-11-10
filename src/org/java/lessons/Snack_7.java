package org.java.lessons;

import java.util.Scanner;

public class Snack_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci un numero di secondi: ");
		String strSeconds = in.nextLine();
		
		in.close();
		
		int intSeconds = Integer.valueOf(strSeconds);
		
		
		int hour = intSeconds / 3600;
		int leftSeconds = intSeconds % 3600;
		int min = leftSeconds / 60;
		int seconds = leftSeconds % 60;
		
		String formattedHour = String.format("%02d", hour);
		String formattedMin = String.format("%02d", min);
		String formattedSec = String.format("%02d", seconds);
		
		System.out.println("formattate in hh:mm:ss sono: " + formattedHour + ":" + formattedMin + ":" + formattedSec);
	
	}

}
