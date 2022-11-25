package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que peça um número correspondente
 * a um determinado ano e em seguida informe se este ano é ou
 * não bissexto.
 * 
 * */
public class Exer17 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		boolean bissexto = scan.nextBoolean();
//		
//		System.out.println("Informe o ano:");
//		int ano = scan.nextInt();
		
//		if(ano % 400 == 0) {
//			bissexto = true;
//			System.out.println("Ano bissexto.");
//		}else if(ano % 4 == 0 && ano % 100 != 0) {
//			bissexto = true;
//			System.out.println("Ano bissexto.");
//		}else {
//			bissexto = false;
//			System.out.println("Não é um ano bissexto.");
//		}
		
		// Código abaixo uma semelhança em C,C++,Java.
		// if(ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)
		// bissexto == true;
		
		// Outra forma com economia de linhas código.
		
		
		System.out.println("Entre com o Ano.");
		int ano = scan.nextInt();
		
		if((ano % 400 == 0)||(ano % 4 == 0 && ano % 100 != 0)){
			System.out.println("É bissexto.");
		}else {
			System.out.println("Não é bissexto.");
		}
		
		
		
		
		scan.close();
	}

}
