package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/*
 * Faça um programa que peça um número e então 
 * mostre a mensagem o número informado foi [número]. 
 * */
public class Exer02 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Entre com um número inteiro: ");
		 int numero = scan.nextInt();
		 System.out.println("O número digitado foi: " + numero);
		 
		 scan.close();
	}

}
