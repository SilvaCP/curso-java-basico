/**
 * @author carlos
 * O programa abaixo repete o programa da aula17labsExer10.
 * Só que mostrando no final a soma dos números.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número:");
		int num2 = scan.nextInt();
		
		int soma = 0;
		
		for(int i = num1; i <= num2; i++) {
			soma += i;
		}
		
		System.out.println("A soma é: " + soma);
		
		
		
		scan.close();
	}
}
