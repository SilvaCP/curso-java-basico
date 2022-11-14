package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/*
 * Faça um programa que peça dois números e imprima a soma.
 * @author Carlos
 * */
public class Exer03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		double num1 = scan.nextDouble();
		System.out.println("Informe o segundo número: ");
		double num2 = scan.nextDouble();
		double soma = num1 + num2;
		System.out.println("A soma do primeiro número com o segundo número é: " + soma);
		
		
		
		
		
		scan.close();
	}

}
