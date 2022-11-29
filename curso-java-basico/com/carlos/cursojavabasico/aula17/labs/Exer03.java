/*
 * @author Carlos.
 * Programa que lê e valida as informações abaixo:
 * Nome: Maior que três caracteres;
 * Idade: Entre 0 e 150;
 * Salário: Maior que 0;
 * Sexo; "M" ou "F";
 * Estado civil: "v,c,s,d";
 *
 * O programa abaixo, faz reúso de variáveis.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean infoValida = false;
		String nome, sexo, stdCivil;
		int idade;
		double salario;

		do {
			System.out.println("Entre com o nome:");
			nome = scan.next();
			if (nome.length() > 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa ter no nínimo 3 caracteres.");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Entre com a idade:");
			idade = scan.nextInt();
			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150:");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Informe o salário:");
			salario = scan.nextDouble();
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salário deve ser maior que zero:");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Informe o sexo:");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				infoValida = true;
			} else {
				System.out.println("O sexo precisa ser 'f' ou 'm':");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Entre com o estado civil:");
			stdCivil = scan.next();
			if (stdCivil.equalsIgnoreCase("s") || stdCivil.equalsIgnoreCase("v") || stdCivil.equalsIgnoreCase("c")
					|| stdCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("Estado civil deve ser 'v', 'c', 's' ou 'd' :");
			}
		} while (!infoValida);

		System.out.println("As seguintes informações foram coletadas:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + stdCivil);

		scan.close();

	}

}
