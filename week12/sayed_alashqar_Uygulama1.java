package sayed;

import java.util.Scanner;

public class sayedha {

	
	public static void main(String[] args) {
		
		//�ift say�lar�n oran� 1 2 3 4 => %50 �ift
		// 3 3 3 4 => %25 �ift
		//[1 2 3 4]
		// 0 1 2 3
		// array[0] = 3;
		// array[2] = 4;
		Scanner sc = new Scanner(System.in);
		int[] array = new int[4]; 
		System.out.println(array.length);
		for (int counter = 0; counter < array.length; counter++) {
			System.out.println("l�tfen sayi giriniz: ");
			array[counter] = sc.nextInt();
		}
		for (int counter = 0;counter < array.length; counter++) {
			System.out.println("Dizinin eleman�: "+ array[counter]);
			
			
			
			
		}
		}
		
		
		
		
		
		
	}

