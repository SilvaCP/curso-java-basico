/**
 * @author carlos
 * A série de Fibonacci é formada pela sequência,
 * 1,1,2,3,5,8,13,21,34,55,...
 * O programa abaixo fará a série até que o valor 
 * seja maior que 500.
 * */
package com.carlos.cursojavabasico.aula17.labs;

public class Exer16 {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		int proximo = 0;
		
		System.out.println(num1);
		System.out.println(num2);
		
		while(proximo <= 500){
			proximo = num1 + num2;
			num1 = num2;
			num2 = proximo;
			
			System.out.println(proximo);
		}
	}

}
