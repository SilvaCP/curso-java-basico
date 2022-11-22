package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que pergunte em que turno você estuda.
 * paça para digitar M-matutino ou V-vespertino ou N-noturno.
 * Imprima a mensagem "Bom dia!", "Boa tarde!", "Boa noite!" ou 
 * "Valor inválido!", conforme o caso. 
 * */
public class Exer10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda?");
		System.out.println("Digite M - para matutino, V - para vespertino, N - para noturno.");
		// Usando o if utiliza o método ignoreCase.
		// Usando o Switch Case precisa utilizar letra minúscula e maiúscula.
		String turno = scan.next();
		
		switch(turno) {
		case "m":
			case "M": System.out.println("Bom dia!");break;
			case "v":
			case "V": System.out.println("Bom tarde!");break;
			case "n":
			case "N": System.out.println("Bom noite!");break;
			default: System.out.println("Valor inválido!");
		}
		
		scan.close();
	}

}
