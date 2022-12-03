/**
 * @author carlos
 * Programa que pede 10 números inteiros, calcula e mostra
 * a quantidade de números pares e a quantidade de números ímpares.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int pares = 0;
		int impares = 0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Entre com o número:");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		System.out.println("Pares: " + pares);
		System.out.println("Ímpares: " + impares);

		scan.close();
	}

}
