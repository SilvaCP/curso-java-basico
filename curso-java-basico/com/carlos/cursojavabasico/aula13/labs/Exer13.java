package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * 
 * Faça um programa que pergunte quanto você ganha por hora
 * e o número de horas trabalhadas no mês. Calcule e mostre o 
 * total do seu salário no referido mês, sabendo-se que são descontados
 * 11% para o imposto de Renda, 8% para o INSS, e 5% para o sindicato, faça
 * um programa que nos dê:
 * Salário Bruto.
 * a. quanto pagou ao INSS.
 * b. quanto pagou ao sindicato.
 * c. o salário líquido.
 * d. calcule o desconto e o salário líquido, conforme a tabela abaixo:
 * + Salário Bruto:R$ - IR (11%) : R$ - INSS(8%) : R$ - Sindicato(5%) : 
 * R$ = Salário Líquido
 * 
 * */
public class Exer13 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Número de horas trabalhadas: ");
		int horasTrabalhadas = scan.nextInt();
		
		double salBruto = valorHora * horasTrabalhadas;
		
		System.out.println("Salário Bruto: " + salBruto);
		double inss = (salBruto / 100) * 8;
		double sindicato = (salBruto / 100) * 5;
		double impostoRenda = (salBruto / 100) * 11;
		
		double totalDesconto = inss + sindicato + impostoRenda;
		double salLiquido = salBruto - totalDesconto; 
		
	//	double salLiquido = salBruto - inss - sindicato - impostoRenda;
		
		System.out.println("Salário Bruto é: " + salBruto);  
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato:" + sindicato);
		System.out.println("Desc: Imposto de Renda: " + impostoRenda);
		System.out.println("Salário líquido é: " + salLiquido);
		
		
		scan.close();
	}

}
