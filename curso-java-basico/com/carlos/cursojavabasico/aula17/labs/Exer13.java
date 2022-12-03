/**
 * @author carlos
 * O programa pede base e expoente, e calcula e mostra
 * o primeiro número elevado ao segundo número. Não utilizando
 * a função de potência da linguagem.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a base:");
		int base = scan.nextInt();
		
		System.out.println("Entre com o potência:");
		int pot = scan.nextInt();
		
		int resultado = base;
		
		for(int i = 1; i < pot; i ++) {
			resultado *= base;
		}
		
		System.out.println("Resultado: " + resultado);

		scan.close();
	}

}
