package com.carlos.cursojavabasico.aula16;

/*
 * @author Carlos.
 * */
public class LoopWhile {

	public static void main(String[] args) {
		int i = 1; // count OU cont
		int max = 10;
		
		// (while) primeiro avalia a expressão e depois executa o bloco de código.
		System.out.println("Contando até: " + max);
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++; // i = i + 1; OU i += 1;
		}
		System.out.println(i); // Valor de 11
		
		// (do while) primeiro executa o bloco de código. E depois avalia a expressão. 
		do {
			i++;
			System.out.println("Valor de i: " + i);
		}while(i < 13); 
		{
			System.out.println(i);
		}
		
	}

}
