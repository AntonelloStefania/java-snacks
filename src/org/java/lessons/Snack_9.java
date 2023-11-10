package org.java.lessons;

import java.util.Arrays;

public class Snack_9 {
	public static void main(String[] args) {
		int[] arrayNum = {1,2,3,4,5,6,7,8,9,10};
		int oddCount = 0;
		int evenCount=0;
		
		for(int x=0; x<arrayNum.length; x++) {
			if(arrayNum[x] %2 == 0) {
				
				evenCount ++;
			}

		}
		for(int x=0; x<arrayNum.length; x++) {
			if(arrayNum[x] %2 == 1) {
				oddCount ++;
				
			}
		}
		System.out.println("i numeri dispari sono: "+oddCount);
		System.out.println("i numeri pari sono: "+ evenCount);
		
		
		int[] oddArray = new int[oddCount];
		int[] evenArray = new int[evenCount];
		
		int oddIndex = 0;
        int evenIndex = 0;

        for (int x = 0; x < arrayNum.length; x++) {
            if (arrayNum[x] % 2 == 0) {
                evenArray[evenIndex] = arrayNum[x];
                evenIndex++;
            } else {
                oddArray[oddIndex] = arrayNum[x];
                oddIndex++;
            }
        }
        System.out.println("Numeri dispari: " + Arrays.toString(oddArray));
        System.out.println("Numeri pari: " + Arrays.toString(evenArray));
	}
}
