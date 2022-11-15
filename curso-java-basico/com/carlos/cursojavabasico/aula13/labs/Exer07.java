package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/**
 * Faça um programa que calcule a área de um quadrado,
 * em seguida mostre o dobro dessa área para o usuário.
 * @author carlos.
 */
public class Exer07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		// Abaixo para cálculo do retângulo.
		
//		System.out.println("Informe o valor da altura: ");
//		double altura = scan.nextDouble();
//		
//		System.out.println("Informe o valor da base: ");
//		double base = scan.nextDouble();
//		
//		double area = base * altura;
//		
//		System.out.println("A área do quadrado é: " + area);
		
		// Abaixo para cálculo do quadrado. 
		
		System.out.println("Entre com o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		// area = lado * lado
		double area = Math.pow(lado, 2);
		
		System.out.println("O valor da área do quadrado é: " + area);
		System.out.println("E o seu dobro é: " + (area * 2));
		
		scan.close();
	}

}
