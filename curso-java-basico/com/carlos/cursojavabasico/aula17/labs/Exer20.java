/**
 * @author carlos
 * O programa abaixo pede para N pessoas a sua idade, ao final o programa
 * verifica de a média de idade da turma varia entre 0 e 25,26 e 60 e maior 
 * que 60; e informa se a turma é jovem, adulta ou idosa, de acordo 
 * com a média calculada.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pesquisa de faixa etária:");
		System.out.println("Entre com a quantidade de idades:");
		int idades = scan.nextInt();
		
		int idade;
		int soma = 0;
		
		for(int i=0; i<idades; i++) {
			System.out.println("Informe a idade da pessoa: " + (i+1));
			idade = scan.nextInt();
			
			soma += idade;
		}
		// Abaixo temos o calculo da média.
		
		double media = soma / idades;
		
		System.out.println("Média de idade: " + media);
		
		if(media > 0 && media <= 25) {
			System.out.println("Jovem.");
		}else if(media >= 26 && media <= 60) {
			System.out.println("Adulto.");
		}else if(media > 60) {
			System.out.println("Idasa.");
		}
	
		scan.close();
	}

}
