package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que verifique se uma letra
 * digitada é vogal ou consoante.
 * 
 * */
public class Exer04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
//		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
//				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
//			System.out.println("Vogal");
//		} else {
//			System.out.println("Consoante");
//		}
		
		// A versão do Java anterior a 7, utilizar switch com String NÃO FUNCIONA.
		// O programa abaixo é simples, e não foi feito testes completo...
		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida! ");
		} else {
			switch(letra) {
			case "a":
			case "e": 
			case "i": 
			case "o": 
			case "u":
			case "A":
			case "E": 
			case "I": 
			case "O": 
			case "U":System.out.println("Vogal"); break;
		default: System.out.println("Consoante");
	
		}
				}
	
		scan.close();
	}

}
