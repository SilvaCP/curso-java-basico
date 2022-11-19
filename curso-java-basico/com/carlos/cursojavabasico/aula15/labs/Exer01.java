package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que peça dois números e imprima o maior deles.
 * */
public class Exer01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int segundoNumero = scan.nextInt();
		
		if(primeiroNumero > segundoNumero) {
			System.out.println("O primeiro número é maior! " + primeiroNumero);
		} else {
			System.out.println("O segundo número é maior! " + segundoNumero);
		}
		
		scan.close();
	}

}
