package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * 
 * Faça um programa que converta metros em centímetros.
 * */
public class Exer05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade em metros: ");
		double metros = scan.nextDouble();
		
		// 1m = 100 cm
		double cm = metros * 100;
		
		System.out.println(metros + " m é igual a " + cm + " cm");
		
		scan.close();
		
	}

}
