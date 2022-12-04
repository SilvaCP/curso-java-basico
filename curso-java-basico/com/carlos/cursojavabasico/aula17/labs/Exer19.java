/**
 * @author carlos
 * O programa calcula e mostra a média aritmética 
 * de N notas.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer19 {
	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		
		System.out.println("Enter the number of notes:");
		int notas = scan.nextInt();
		
		double soma = 0;
		double media;
		double nota;
			
		for(int i=0; i<notas; i++) {
			System.out.println("Enter the notes: " + (i + 1));
			nota = scan.nextDouble();
			soma += nota; 
		}
		
		media = soma / notas;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	
		scan.close();
	}

}
