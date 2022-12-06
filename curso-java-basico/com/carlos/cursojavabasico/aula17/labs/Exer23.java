package com.carlos.cursojavabasico.aula17.labs;
/**
 * @author carlos
 * Um item custa R$:1,99
 * e o valor total é de acordo com a quantidade de itens.
 * monte uma tabela de preço que contém de 1 a 50 itens.
 * */
public class Exer23 {
	public static void main(String[] args) {
		System.out.println("Lojas Quase Dois - Tabela de preços:");
		
		for(int i=1; i<=50; i++) {
			System.out.println(i + " _ R$: " + (1.99 * i));
		}
	}

}
