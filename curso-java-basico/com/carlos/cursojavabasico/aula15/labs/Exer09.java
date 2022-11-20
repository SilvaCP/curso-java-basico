package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author: Carlos.
 * Faça um programa que leia três números e mostre-os
 * em ordem decrescente.
 * OBS: Existe uma maneira fácil de resolver esse problema, que é a Ordenação de vetores.
 * Ordenação de Arrays, mas aqui o estudo é de variáveis e leitura de dados no teclado, if else.
 * e Switch Case. E a maneira mais simples de se resolver é usando if else.
 * */
public class Exer09 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o 2º número:");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite o 3º número:");
		double num3 = scan.nextDouble();
		
//		if (num1 >= num2 && num2 >= num3) {
//			System.out.println("A ordem decrescente dos números são: " + num1 +"  "+ num2 +"  "+ num3);
//		} else if (num1 >= num3 && num3 >= num2) {
//			System.out.println("A ordem decrescente dos números são: " + num1 +"  "+ num3 +"  "+ num2);
//		} else if (num2 >= num1 && num1 >= num3) {
//			System.out.println("A ordem decrescente dos números são: " + num2 +"  "+ num1 +"  "+ num3);
//		} else if (num2 >= num3 && num3 >= num1) {
//			System.out.println("A ordem decrescente dos números são: " + num2 +"  "+ num3 +"  "+ num1);
//		} else if (num3 >= num1 && num1 >= num2) {
//			System.out.println("A ordem decrescente dos números são: " + num3 +"  "+ num1 +"  "+ num2 );
//		} else if (num3 >= num2 && num2 >= num1) {
//			System.out.println("A ordem decrescente dos números são: " + num3 +"  "+ num2 +"  "+ num1);
//		}
		
		// Abaixo outra maneira de resolução.
		
		if(num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// num1 é menor  // num3 é maior //A ordem decrescente é: num3 - num2 - num1
			System.out.println(num3 + " -- " + num2 + " -- " + num1);
		}else if(num1 <= num2 && num1 <= num3 && num3 <= num2){
			// num1 é menor // num2 é maior //A ordem decrescente é:  num2 - num3 - num1 
			System.out.println(num2 + " -- " + num3 + " -- " + num1);
		}else if(num2 <= num1 && num2 <= num3 && num1 <= num3){
			// num2 é menor // num3 é maior //A ordem decrescente é: num3 - num1 - num2
			System.out.println(num3 + " -- " + num1 + " -- " + num2);
		}else if(num2 <= num1 && num2 <= num3 && num3 <= num1){
			// num2 é menor // num1 é maior // A ordem decrescente é: num1 - num3 - num2 
			System.out.println(num1 + " -- " + num3 + " -- " + num2);
		}else if(num3 <= num1 && num3 <= num2 && num1 <= num2){
			// num3 é menor // num2 é maior //A ordem decrescente é: num2 - num1 - num3
			System.out.println(num2 + " -- " + num1 + " -- " + num3);
		}else if(num3 <= num1 && num3 <= num2 && num2 <= num1){
			// num3 é menor // num1 é maior //A ordem decrescente é: num1 - num2 - num3
			System.out.println(num1 + " -- " + num2 + " -- " + num3);
		}
		scan.close();
	}
}
