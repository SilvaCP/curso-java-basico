package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que peça a temperatura em graus Celsius, transforme 
 * e mostre em Farenheit. 
 * */
public class Exer10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor da temperatura em Celsius: ");
		double grausCelsius = scan.nextDouble();
		
		// F = C * 1.8 +32
		double Farenheit = (grausCelsius * 1.8) + 32;
		System.out.println("Temperatura em Farenheit é: " + Farenheit);
		
		scan.close();
	}

}
