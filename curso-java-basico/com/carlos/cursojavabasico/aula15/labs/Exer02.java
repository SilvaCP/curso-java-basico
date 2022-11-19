package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author Caarlos.
 * Faça um programa que peça um valor e mostre na tela se ele é positivo ou negativo.
 * */
public class Exer02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		double valor = scan.nextDouble();
		
		if (valor < 0) {
			System.out.println("O valor é negativo. " + valor);
		} else {
			System.out.println("O valor é positivo. " + valor);
		}
		
		scan.close();		
	}
}
