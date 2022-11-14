package com.carlos.cursojavabasico.aula12;

import java.util.Scanner;

public class LeituraPeloTeclado {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Favor digite seu nome completo:");
//		String nomeCompleto = scan.nextLine();
//		System.out.println("Seu nome completo é: " + nomeCompleto);
//		
//		System.out.println("Favor digite o seu primeiro nome:");
//		String primeiroNome = scan.next();
//		System.out.println("O seu primeiro nome é: " + primeiroNome);
//		
//		System.out.println("Favor informe a sua idade:");
//		int idade = scan.nextInt();
//		System.out.println("A sua idade é: " + idade + " anos!");
		
//		System.out.println("Informe a sua altura:");
//		double altura = scan.nextDouble();
//		System.out.println("A sua altura é: " + altura);
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimeção:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você declarou os seguintes valores: ");
		System.out.println("Primeiro nome é: " + primeiroNome);
		System.out.println("Idade é: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Possui Pet: " + temPet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
