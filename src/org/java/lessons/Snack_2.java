package org.java.lessons;

import java.util.Random;

public class Snack_2 {
	public static void main(String[] args) {
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo",
						"Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito",
							"Romano", "Gallo", "Conti", "Marino"};

	
		for(int x=0; x<nomi.length; x++) {
			Random name = new Random();
			int maxName = nomi.length;
			int nameResult = name.nextInt(maxName);
			
			Random surname = new Random();
			int maxSurname = cognomi.length;
			int surnameResult = surname.nextInt(maxSurname);
			
			System.out.print(nomi[nameResult] + " " + cognomi[surnameResult]+ "\n");
			

		}
	}
}
