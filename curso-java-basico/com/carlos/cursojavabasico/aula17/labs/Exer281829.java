/**
 * @author carlos
 * Programa que gera uma lista de números primos existantes
 * entre 1, e um número inteiro informado pelo usuário.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer281829 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número:");
		int num = scan.nextInt();

		boolean primo;

		for (int i = 1; i <= num; i++) {
			primo = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}
			}

			if (primo) {
				System.out.println(i);
			}
		}

		scan.close();
	}

}
