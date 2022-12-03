/**
 * @author carlos
 * O programa abaixo recebe dois números inteiros
 * e gera os números inteiros que estão no intervalo
 * compreendidos por eles.
 * 
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número:");
		int num2 = scan.nextInt();
		
		for(int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
		scan.close();
	}

}
