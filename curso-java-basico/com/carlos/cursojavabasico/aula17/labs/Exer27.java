/**
 * @author Carlos
 * O Departamento Estadual de Meteorologia lhe contratou 
 * para desenvolver um programa que leia as um conjunto
 * indeterminado de temperatura, e informe ao final a menor
 * e a maior temperatura informadas bem como as médias das
 * temperaturas.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de temperatura:");
		int qtdTemperatura = scan.nextInt();

		double temp, soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;

		for (int i = 1; i <= qtdTemperatura; i++) {

			System.out.println("Entre com a temperatura: " + i);
			temp = scan.nextDouble();
			soma += temp;

			if (temp > maior) {
				maior = temp;
			}
			if (temp < menor) {
				menor = temp;
			}
		}
		System.out.println("Média: " + (soma / qtdTemperatura));
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Maior temperatura: " + maior);

		scan.close();
	}

}
