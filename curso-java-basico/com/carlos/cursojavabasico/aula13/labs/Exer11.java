package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que peça dois números inteiros e um número real.
 * Calcule e mostre:
 * a: O produto do dobro do primeiro com metade do segundo.
 * b: A soma do tripulo do primeiro com o terceiro.
 * c: O terceiro elevado ao cubo.
 * */
public class Exer11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número inteiro: ");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro número real: ");
		double num3 = scan.nextDouble();
		
		int resultado1 = (num1 * 2) * (num2 / 2);
		double resultado2 = (num1 * 3) + num3;
		double resultado3 = Math.pow(num3, 3);
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);
		
		scan.close();
		
	}

}
