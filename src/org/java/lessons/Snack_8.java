package org.java.lessons;

import java.util.Scanner;

public class Snack_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("scrivi una parola: ");
		String word = in.nextLine();
		
		in.close();
		
		String newWord="";
		for(int x=0; x<word.length();x++) {
			char singleChar = word.charAt(x);

			if(word.charAt(x)=='a') {
				newWord += 'o';
				
			}else if (word.charAt(x)=='o') {
				newWord+='a';
			}else {
				newWord += singleChar;
			}
			
			
		}
		System.out.println("la nuova parola e': " + newWord);
	}
}
