package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Um posto está vendendo combustíveis com a seguinte tabela 
 * de descontos: 
 * 
 * Álcool: até 20L, (30% desc/L), -  acima de 20L, (5% desc/L).
 * 
 * Gasolina: até 20L, (5% desc/L) -  acima de 20L, (6% desc/L).
 * 
 * Escreva um algorítimo que leia o número de litros vendidos,
 * o tipo de combustível(codificado da seguinte forma: A-álcool,
 * G-gasolina), 
 * 
 * Calcule e imprima o valor a ser pago pelo cliente.
 * Sabendo-se que o preço do litro da gasolina é R$:2,50 e o preço
 * do litro do álcool é R$:1,90.
 * 
 * */
public class Exer21 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de litros:");
		double litros = scan.nextDouble();
		
		System.out.println("Tipo combustível:");
		String tipo = scan.next();
		
		double gasolina = 2.50;
		double alcool = 1.90;
		int percDesconto = 0;
		double total = 0;
		double totalDesc = 0;
		
		if(tipo.equalsIgnoreCase("a")) {
			if (litros <= 20) {
				percDesconto = 3;
			}else {
				percDesconto = 5;
			}
			
			total = litros * alcool;
			
		}else if(tipo.equalsIgnoreCase("g")) {
			if (litros <= 20) {
				percDesconto = 4;
			}else {
				percDesconto = 6;
			}
			
			total = litros * gasolina;
		}
		
		totalDesc = (total / 100 ) * percDesconto;
		double precoApagar = total - totalDesc;
		
		System.out.println("Valor a ser pago: " + precoApagar);

		scan.close();
	}

}
