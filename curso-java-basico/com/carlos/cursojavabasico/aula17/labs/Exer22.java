/**
 * @author carlos
 * Faça um programa que calcule o valor total investido
 * por um colecionador em sua coleção de CDs e o valor médio 
 * gasto em cada um deles. O usuário deverá informar a quantidade
 * de CDs e o valor para em cada um.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número de CDs:");
		int numCds = scan.nextInt();

		double valorCd;
		double soma = 0;

		for (int i = 1; i <= numCds; i++) {
			System.out.println("Informe o valor do CD: " + i);
			valorCd = scan.nextDouble();

			soma += valorCd;
		}

		double media = soma / numCds;
		System.out.println("A média gasta com cada DC é: " + media);

		scan.close();
	}

}
