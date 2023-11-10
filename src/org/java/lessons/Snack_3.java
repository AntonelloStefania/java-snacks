package org.java.lessons;

public class Snack_3 {
	public static void main(String[] args) {
		int[] intNumber= {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		for(int x=0; x<intNumber.length; x++) {
			if(x % 2 == 1) {
				sum += intNumber[x];
			}
		}
		System.out.println(sum);
	}
}
