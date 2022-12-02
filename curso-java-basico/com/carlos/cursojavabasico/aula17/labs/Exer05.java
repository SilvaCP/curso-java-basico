/*
 * @author Carlos.
 * Faça um programa que permita que o usuário informe as populações e as
 * taxas de crescimento iniciais; Valide a entrada e permita a repetição
 * da operação.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer05{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		// Utilização do DO - WHILE
		boolean valido = false;
		do {
			System.out.println("População de A:");
			popA = scan.nextDouble();
			
			if(popA > 0) {
				valido = true;
			}else {
				System.out.println("PopA tem que ser maior que zero!");
			}
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("População de B:");
			popB = scan.nextDouble();
			
			if(popB > 0) {
				valido = true;
			}else {
				System.out.println("PopB tem que ser maior que zero!");
			}
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Taxa da população de A:");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0) {
				valido = true;
			}else {
				System.out.println("Taxa da população de A, tem que ser maior que zero!");
			}
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Taxa da população de B:");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0) {
				valido = true;
			}else {
				System.out.println("Taxa da população de B, tem que ser maior que zero!");
			}
		}while(!valido);
		
		// Começando com o cálculo... 
		int cont = 0;
		// Utilização do WHILE
		while (popA < popB) {
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}

		System.out.println("População A:  " + popA);
		System.out.println("População B:  " + popB);
		System.out.println("Qtd anos: " + cont);
		
		scan.close();
	}
	
}
	
