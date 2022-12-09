/**
 * @author carlos
 * O programa abaixo gera a tabuada de qualquer número inteiro,
 * entre 1 a 10. O usuário deve informar de qual número ele deseja
 * ver a tabuada.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número para gerar a tabuada:");
		int num = scan.nextInt();

		System.out.println("Tabuada de " + num + " é:");

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

		scan.close();
	}

}
