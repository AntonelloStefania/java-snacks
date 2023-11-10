package org.java.lessons;

import java.util.Scanner;

public class Snack_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


        boolean controller=false;
        
        while(!controller) {
        	
    	  System.out.print("Inserisci una parola: ");
          String word = in.nextLine();
          
          int letters = 0;
          int numbers = 0;
          int symbols = 0;
              
	        for (int x = 0; x < word.length(); x++) {
	            char carattere = word.charAt(x);
	
	            if (Character.isLetter(carattere)) {
	                letters++;
	            } else if (Character.isDigit(carattere)) {
	                numbers++;
	            } else {
	                symbols++;
	            }

	        }
	        
	        if (word.contains("0")) {
                controller = true;
                System.out.println("Hai inserito il numero 0.");
            }
                System.out.println("Lettere: " + letters);
                System.out.println("Numeri: " + numbers);
                System.out.println("Simboli: " + symbols);

		}
        in.close();
	}
	
	
}
