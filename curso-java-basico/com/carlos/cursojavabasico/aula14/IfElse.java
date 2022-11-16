package com.carlos.cursojavabasico.aula14;

import java.util.Scanner;

/*
 * @author Carlos.
 * Exemplo do uso do (If And Else) Controles, Decisões.
 * 
 * */
public class IfElse {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Qual é a idade: ");
//		int idade = scan.nextInt();
		
//		if(idade >= 18) {
//			System.out.println("É maior de idade. ");
//		} else {
//			System.out.println("Não é maior de idade. ");
//		}
		
		// Exemplo de exercício: 
		
		// barato <= 10
		// 10 < valor < 15  - pode pedir desconto.
		// 15 <= valor < 17  - pesquisar mais.
		// valor >=  17  - Sai fora, pois está muito caro.
		
		System.out.println("Entre com o preço do Item: ");
		double valor = scan.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Está barato, pode comprar! ");	
		} else if (valor > 10 && valor < 15) {
			System.out.println("Você pode pedir desconto. ");
		} else if (valor >= 15 && valor < 17){
			System.out.println("você pode pesquisar mais. ");
		} else {
			System.out.println("Sai fora, está muito caro, não vale a pena! ");
		}
		scan.close();
		
	}

}
