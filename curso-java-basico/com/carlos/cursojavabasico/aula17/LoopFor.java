package com.carlos.cursojavabasico.aula17;

/*
 * @author Carlos
 * */
public class LoopFor {
	public static void main(String[] args) {
		// Exemplo abaixo: com uma variável incremento e decremento.
		// No for( inicialização - condição - atualização )

//		for(int i = 0;i < 5; i++) {
//			System.out.println("i tem valor de: " + i);
//		}

//		for(int i = 5 ; i >= 0 ; i--) {
//			System.out.println("i tem valor de: " + i);
//		}

		// Exemplo abaixo: com mais de uma variável

//		for(int i = 0 , j = 10; i < j; i++ , j--) {
//			System.out.println("i = " + i + "; j = " + j);
//		}

		// Exemplo abaixo: partes ausentes.

//		int count = 0;
//		for(;count < 10;) {
//			System.out.println("valor de count: " + count);
//			count += 2;
//		}
//		
//		// Abaixo o mesmo exemplo: partes presentes.
//		
//		for(int cont = 0; cont < 10; cont += 2) {
//			System.out.println("valor de cont: " + cont);
//		}

		// Abaixo soma em pares.

//		int soma = 0;
//		for(int i = 1; i < 5; soma +=i ++) {
//			
//		}

		// Abaixo exemplo com a não utilização das chaves. ATENÇÃO: NÃO RECOMENDO.

//		int soma = 0;
//		for(int i = 1; i < 5; soma +=i ++);
//			System.out.println("O valor da soma é: " + soma);

		for (int i = 0; i < 5; i++)
			System.out.println("i tem valor de: " + i);

	}

}
