/**
 * @author carlos
 * O programa abaixo lê (5 cinco) números.
 * E informa a soma e a média dos números.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int soma = 0;
		double  media;
		
		for(int i=0; i<5; i++) {
			
			System.out.println("Informe um número:");
			num = scan.nextInt();
			
			soma += num;
		}
			media = soma / 5;
			
			System.out.println("A média é: " + media);
			System.out.println("A soma é: " + soma);
		
		scan.close();
	}

}
