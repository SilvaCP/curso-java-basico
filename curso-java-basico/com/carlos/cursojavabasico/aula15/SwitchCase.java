package com.carlos.cursojavabasico.aula15;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana (1 - 7): ");
		int diaSemana = scan.nextInt();
		
//		if(diaSemana == 1) {
//			System.out.println("Domingo ");
//		} else if (diaSemana == 2) {
//			System.out.println("Segunda ");
//		} else if (diaSemana == 3) {
//			System.out.println("Terça-feira ");
//		} else if (diaSemana == 4) {
//			System.out.println("Quarta-feira ");
//		} else if (diaSemana == 5) {
//			System.out.println("Quinta-feira ");
//		} else if (diaSemana == 6) {
//			System.out.println("Sexta-feira ");
//		} else if (diaSemana == 7) {
//			System.out.println("Sábado ");
//		} else {
//			System.out.println("Valor inválido, favor verifique o número digitado! ");
//		}
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo "); break; // Senão tiver break, ele sai excecutando até encontar um break.
		case 2: System.out.println("Segunda-feira "); break;
		case 3: System.out.println("Terça-feira "); break;
		case 4: System.out.println("Quarta-feira "); break;
		case 5: System.out.println("Quinta-feira "); break;
		case 6: System.out.println("Sexta-feira "); break;
		case 7: System.out.println("Sábado "); break;
		default: System.out.println("Dia da semana inválido!");
		}
		scan.close();
	}

}
