package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que peça a temperatura em graus Farenheit, transforme 
 * e mostre essa temperatura em graus Celsius.
 * 
 * */
public class Exer09 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor da temperatura em Farenheit: ");
		double grausFarenheit = scan.nextDouble();
		// C = (5*(F-32)/9)
		double grausCelsius = (5*(grausFarenheit - 32)/9);
		
		System.out.println("A temperatura em graus Celsius é: " + grausCelsius);
		
		scan.close();
	}

}
