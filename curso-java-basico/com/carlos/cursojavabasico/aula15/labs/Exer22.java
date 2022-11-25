package com.carlos.cursojavabasico.aula15.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Escreva um algoritmo para ler a quantidade de morangos
 * a quantidade de maçãs adquiridas e escreva o valor a ser
 * pago pelo o cliente. Obs: A soma das frutas > 8kg. Ou valor 
 * compras > 25kg terá um desconto de 10%.
 * 
 * */
public class Exer22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos kilos(Kg) de morangos:");
		double qtdMorango = scan.nextDouble();
		
		System.out.println("Quantos kilos(kg) de maçãs:");
		double qtdMacas = scan.nextDouble();
		
		double precoKgMorango = 0;
		
		if(qtdMorango <= 5) {
			precoKgMorango = 2.5;
		}else {
			precoKgMorango = 2.2;
		}
		
		double precoKgMaca = 0;
		
		if(qtdMacas <= 5) {
			precoKgMaca = 1.8;
		}else {
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = qtdMorango * precoKgMorango;
		double precoTotalMaca = qtdMacas * precoKgMaca;
		double precoParcial = precoKgMorango + precoKgMaca;
		double precoTotal = precoParcial;
		
		if((qtdMacas + qtdMorango > 8) || precoParcial > 25){
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}
		
		System.out.println("Preço total = " + precoTotal);
		
		scan.close();
	}

}
