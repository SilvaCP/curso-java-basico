package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que mostre as quatro notas bimestrais
 * e mostre a média.
 * */
public class Exer04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a nota do 1ºbimestre: ");
		double nota1 = scan.nextDouble(); 
		
		System.out.println("Informe a nota do 2ºbimestre: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Informe a nota do 3ºbimestre: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Informe a nota do 4ºbimestre: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A média é: " + media);
		
		scan.close();
	}

}
