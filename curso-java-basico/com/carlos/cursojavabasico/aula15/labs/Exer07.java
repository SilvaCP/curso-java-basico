package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que leia três números e mostre o maior e o menor deles.
 * */
public class Exer07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número:");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro número:");
		double num3 = scan.nextDouble();
		
//		if (num1 > num2 && num1 > num3 && num2 > num3) {
//			System.out.println("O Maior número é: " + num1 + " e o menor é: " + num3);
//		} else if (num2 > num1 && num2 > num3 && num1 < num3) {
//			System.out.println("O Maior número é: " + num2 + " e o menor é: " + num1);
//		} else if ( num3 > num2 && num3 > num1 && num1 > num2) {
//			System.out.println("O Maior número é: " + num3 + " e o menor é: " + num2);
//		}

		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O maior valor digitado é: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O maior valor digitado é: " + num2);
		} else {
			System.out.println("O maior valor digitado é: " + num3);
		}
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("O menor valor digitado é: " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("O menor valor digitado é: " + num2);
		} else {
			System.out.println("O menor valor digitado é: " + num3);
		}
	
		scan.close();
	}

}
