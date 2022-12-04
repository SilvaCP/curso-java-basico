/**
 * @author carlos
 * A série de Fibonacci é formada pela sequência 1,1,2,3,5,8,13,21,34,55...
 * O programa é capaz de gerar a série até o n-ésimo termo.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o n-ésimo termo da série de fibonacci:");
		int n = scan.nextInt();

		int primeiro = 1;
		int segundo = 1;
		int proximo;

		System.out.println(primeiro);
		System.out.println(segundo);

		for (int i = 3; i <= n; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.println(proximo);
		}

		scan.close();
	}

}
