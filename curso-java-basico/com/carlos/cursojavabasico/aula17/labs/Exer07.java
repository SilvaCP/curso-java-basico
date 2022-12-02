/**
 * @author carlos.
 * O programa abaixo lê cinco números e informa o 
 * maior número entre eles.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE; // Menor valor possível.
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe um número:");
			num = scan.nextInt();
			
			if(num > maior) {
				maior = num;
				System.out.println("O número maior mudou: " + maior);
			}
		}
		
		System.out.println("O maior número digitado foi: " + maior);
		
		scan.close();
	}

}
