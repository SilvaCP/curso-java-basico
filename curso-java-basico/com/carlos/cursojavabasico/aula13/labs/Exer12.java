package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Tendo como dados de entrada a altura de uma pessoa, construa 
 * um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
 * 
 * (72.7*altura)-58
 * 
 * */
public class Exer12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Peso ideal baseado na altura é: " + pesoIdeal);
		
		
		
		scan.close();
	}

}
