package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/*
 * @autor Carlos.
 * 
 * Faça um programa que pergunte quanto você ganha por hora, e o número de horas
 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 * 
 * */
public class Exer08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de horas trabalhada no mês: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double totalSal = horasTrabalhadas * valorHora;
		
		System.out.println("Total a receber: " + totalSal);
		
		scan.close();
	}

}
