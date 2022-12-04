/**
 * @author carlos
 * Faça um programa que calcule o fatorial de um número inteiro.
 * fornecido pelo usuário, Ex: 5!= 5.4.3.2. 1=120
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int num = scan.nextInt();
		
		System.out.println(num + "! = ");
		
		int fatorial = 1;
		for(int i = num; i > 0; i-- ) {
			fatorial *= i;
			System.out.println(i);
		}
		
		System.out.println("Resultado: " + fatorial);
		
		scan.close();
	}

}
