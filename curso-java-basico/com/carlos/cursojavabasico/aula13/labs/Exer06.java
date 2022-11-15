package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * 
 * Faça um programa que peça um raio de um círculo, calcule e mostre sua área.
 * */
public class Exer06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o valor do raio do círculo: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + area);
		
		scan.close();
	}

}
