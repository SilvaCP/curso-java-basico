package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que leia três números, e mostre o maior deles.
 * */
public class Exer06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número:");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro número:");
		double num3 = scan.nextDouble();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O maior valor digitado é: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O maior valor digitado é: " + num2);
		} else {
			System.out.println("O maior valor digitado é: " + num3);
		}
		 
		scan.close();
	}

}
