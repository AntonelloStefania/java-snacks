package org.java.lessons;

import java.util.Scanner;

public class Snack_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("inserisci una parola: ");
		String word = in.nextLine();
		
		
		in.close();
	
		

        String reverseStr ="";

        for (int x = word.length() -1; x >= 0; x--) {
           char c = word.charAt(x);
           reverseStr +=c;
        }

        if(word.equals(reverseStr)) {
        	System.out.println("la parola " + word + " e' palindroma");
        }else {
        	System.out.println("la parola " + word + " non e' palindroma");
        }
	}
}
