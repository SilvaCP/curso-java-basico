/**
 * @author carlos
 * O programa pede um número inteiro e determina se ele é ou
 * não um número primo. Um número primo é aquele que é divisível,
 * somente por ele mesmo, e por um.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer18 {
	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				System.out.println("Não é primo - divisível por " + i);
				primo = false;
			}
		}
		
		if(primo) {
			System.out.println("É número primo.");
		}
		
		
		
		
		
		
		scan.close();
		
	}

}
