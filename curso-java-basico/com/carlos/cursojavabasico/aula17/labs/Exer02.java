package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

/*
 * @author Carlos
 * Faça um programa que leia nome e senha do usuário.
 * E não aceite a senha igual ao nome do usuário.
 * mostrando uma mensagem de erro e voltando a pedir as
 * informações.
 * */
public class Exer02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		String nomeUser;
		String senha;
		
		do {
			System.out.println("Nome do usuário:");
			nomeUser = scan.next();
			
			System.out.println("Senha do usuário:");
			senha = scan.next();
			
			if(nomeUser.equalsIgnoreCase(senha)) {
				System.out.println("Senha igual ao nome do usuário, favor digitar novamente.");
			}else {
				infoValidas = true;
				System.out.println("Senha e usuário válidos.");
			}
			
		}while(!infoValidas);
		
		scan.close();
	}

}
