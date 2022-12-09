/**
 * @author carlos
 * Tabuada, que o usuário informa, o valor inicial e final. 
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um número para gerar a tabuada:");
		int num = scan.nextInt();

		boolean invalido = true;
		int valorInicial, valorFinal;

		do {

			System.out.println("Valor inicial:");
			valorInicial = scan.nextInt();

			System.out.println("Valor final:");
			valorFinal = scan.nextInt();

			if (valorFinal < valorInicial) {
				invalido = false;
			}

		} while (!invalido);

		System.out.println("Tabuada de: " + num + ":");
		System.out.println("Começar por: " + valorInicial);
		System.out.println("Terminar em: " + valorFinal);
		System.out.println();

		for (int i = valorInicial; i <= valorFinal; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

		scan.close();
	}

}
