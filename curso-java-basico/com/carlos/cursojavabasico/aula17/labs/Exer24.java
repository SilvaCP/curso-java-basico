/**
 * @author carlos
 * O programa abaixo mostra uma tabela de preços de pães,
 * apartir do preço do pão R$:0,18
 * */
package com.carlos.cursojavabasico.aula17.labs;

public class Exer24 {
	public static void main(String[] args) {
		
		System.out.println("Preço do pão R$:0,18");
		System.out.println("Panificadora Pão de Ontem _ Tabela de Preços");
		
		for(int i = 1; i <= 50; i++ ) {
			System.out.println(i + " _ R$: " + (0.18 * i));
		}
	}	//Obs: Números int não são preciso, existe clases especiais para
		// trabalhos com números precisos.

}
