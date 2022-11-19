package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que verifique se uma letra digitada é 'F' ou 'M'.
 * Conforme a letra, escrever: F - Feminino, M - Masculino, Sexo - inválido.
 *  
 * */

public class Exer03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite (F) para feminino, ou (M) para masculino.");
		String input = scan.next();
		
		if ( input.equalsIgnoreCase("F")) {
			System.out.println("Sexo - feminino.");
		} else if (input.equalsIgnoreCase("M")) {
			System.out.println("Sexo - masculino.");
		} else {
			System.out.println("Sexo inválido.");
		}
		
		scan.close();
	}
}
