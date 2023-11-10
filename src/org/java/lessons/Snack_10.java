package org.java.lessons;


import java.util.Scanner;

public class Snack_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("inserisci un primo numero: ");
		int num1 = in.nextInt();
		
	
		System.out.println("inserisci un secondo numero: ");
		int num2 = in.nextInt();
		
		in.close();
		
		int minNum= 0;
		int maxNum=0;
		
		if(num1 > num2) {
			minNum=num2;
			maxNum=num1;
		}else {
			minNum=num1;
			maxNum=num2;
		}
		
		System.out.println("il numero maggiore è: "+ maxNum);
		System.out.println("il numero maggiore è: "+ minNum);
		int c= 0;
		int sum= 0;
		for(int x=minNum; x<=maxNum; x++) {
			 c = x;
			
			sum+=c;
		}
		System.out.println("la somma dei numeri compresi tra il min e il max sono: " + sum);
	
	}
}
