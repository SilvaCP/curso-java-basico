package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que pergunte o preço de três produtos
 * e informe qual o produto que você deve comprar, sabendo que 
 * a decisão é sempre pelo mais barato.
 * 
 * */
public class Exer08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o preço do produto1:");
		double produto1 = scan.nextDouble();
		
		System.out.println("Informe o preço do produto2:");
		double produto2 = scan.nextDouble();
		
		System.out.println("Informe o preço do produto3:");
		double produto3 = scan.nextDouble();
		
		if ( produto1 >= produto2 && produto1 >= produto3 ) {
			System.out.println("O produto1 é mais caro, não compre. " + produto1);
		} else if ( produto2 >= produto1 && produto2 >= produto3 ) {
			System.out.println("O produto2 é mais caro, não compre. " + produto2);
		} else if ( produto3 >= produto1 && produto3 >= produto2 ) {
			System.out.println("O produto3 é mais caro, não compre. " + produto3);
		}
		
		if ( produto1 <= produto2 && produto1 <= produto3 ) {
			System.out.println("O produto1 é mais barato, pode comprar. " + produto1);
		} else if ( produto2 <= produto1 && produto2 <= produto3 ) {
			System.out.println("O produto2 é mais barato, pode comprar. " + produto2);
		} else if ( produto3 <= produto1 && produto3 <= produto2 ) {
			System.out.println("O produto3 é mais barato, pode comprar. " + produto3);
		}
		
		scan.close();
	}

}
