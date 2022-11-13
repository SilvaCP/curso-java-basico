package com.carlos.cursojavabasico.aula11;

public class CuriosidadeInt {
	public static void main(String[] args) {
		// Pegadinhas de entrevista em multnaconais.
		// Resposta é uma roleta, o próximo valor após exceder o limita é o menor valor.
		// Os números no Java funcionam como uma roleta.
		//int var01 = 2147483647;
		//int var02 = 100;
		
		//System.out.println(var01 + var02); // Saída -2147483549
		
		int var03 = 2147483647;
		int var04 = 1;
		System.out.println(var03 + var04); // Saída -2147483648
		
		// Exemplos 
		// double d1 = 123.4;
		// double d2 = 1.234e2; Notação científica.
		// float f1 = 123.4f;
		
		
	}

}
