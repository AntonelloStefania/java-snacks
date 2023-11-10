package org.java.lessons;

import java.util.Scanner;

public class Snack_6 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Inserisci un numero: ");
			String strNumber = in.nextLine();

			in.close();
			for(int x=0; x < strNumber.length();x++) {
				char singleChar = strNumber.charAt(x);
				
				String strChar = singleChar + "";
				
				int finalNumber = Integer.valueOf(strChar);
				int intChar = finalNumber;
				System.out.print(intChar);
			}
			
			 
		}

}
