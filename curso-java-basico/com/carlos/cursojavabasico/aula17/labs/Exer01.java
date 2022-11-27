package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que peça uma nota, entre 0 e 10.
 * Mostre uma mensagem caso o valor seja inválido e 
 * continue pedindo até que o usuário informe um valor
 * válido.
 * */
public class Exer01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre 0 e 10:");
		
		boolean notaValida = false;
		
		do {
			double nota = scan.nextDouble();
			
			if(nota >= 0 && nota <= 10 ) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			}else {
				System.out.println("Nota inválida! Digite novamente.");
			}
		}while(!notaValida);
		
		scan.close();
	}

}
