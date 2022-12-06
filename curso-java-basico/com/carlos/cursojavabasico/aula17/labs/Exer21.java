/**
 * @author carlos
 * Programa abaixo faz um calculo a média da qtd de 
 * alunos por turma. As turmas não pode ter mais de 40 
 * alunos.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a Qtd de turmas:");
		int qtdTurmas = scan.nextInt();

		int qtdAlunos;
		int soma = 0;
		boolean invalido = true;

		for (int i = 1; i <= qtdTurmas; i++) {
			invalido = true;
			do {

				System.out.println("Quantidade de alunos da turma: " + i);
				qtdAlunos = scan.nextInt();

				if (qtdAlunos <= 40) {
					invalido = false;
				} else {
					System.out.println("Qtd de alunos inválido! Digite novamente!");
				}
			} while (invalido);

			soma += qtdAlunos;
		}
		double media = soma / qtdTurmas;
		System.out.println("Média :" + media);

		scan.close();
	}

}
