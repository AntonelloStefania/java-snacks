package org.java.lessons;

import java.util.Scanner;

public class Snack_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("inserisci un numero: ");
		String strValue = in.nextLine();
		int intValue = Integer.valueOf(strValue);
		
		
		if(intValue % 2 == 0 ) {
			System.out.println("il numero inserito e' pari ed e': " + intValue);
		}else {
			System.out.println("hai inserito " + intValue + " quindi restituisco " + (intValue + 1));
		}
		
		
	}
}
