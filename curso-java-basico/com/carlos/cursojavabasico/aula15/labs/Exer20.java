package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author Carlos
 * */
public class Exer20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para vítima?");
		String resposta1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da vítima?");
		String resposta3 = scan.next();
		
		System.out.println("Já trabalhou com a vítima?");
		String resposta4 = scan.next();
		
		System.out.println("Devia para à vítima?");
		String resposta5 = scan.next();
		
		int cont = 0; // Implementação de um contador.
		
		if(resposta1.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resposta2.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resposta3.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resposta4.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resposta5.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(cont == 2) {
			System.out.println("Suspeita.");
		}else if(cont >= 3 && cont <= 4) {   // poderia usar:  cont == 3 || cont == 4
			System.out.println("Cúmplice.");
		}else if(cont ==  5) {
			System.out.println("Culpado.");
		}else if(cont == 0) {
			System.out.println("Inocente.");
		}
		
		scan.close();
	}

}
