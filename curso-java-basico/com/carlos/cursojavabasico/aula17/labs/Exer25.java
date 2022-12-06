/**
 * @author carlos
 * Caixa registradora.
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.util.Scanner;

public class Exer25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// System.out.println("Lojas Tabajaras:");

		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		String output;
		double valorPago, troco;

		do {
			System.out.println("Deseja informar nova compra? S/N");
			continuarCompra = scan.next();

			if (continuarCompra.equalsIgnoreCase("s")) {

				output = "Lojas Tabajaras:\n";

				System.out.println("Quantidade de produto da compra:");
				qtdProdutos = scan.nextInt();

				total = 0;

				for (int i = 1; i <= qtdProdutos; i++) {
					System.out.println("Informe o preço do produto: " + i);
					preco = scan.nextDouble();
					total += preco;
					output += "Preço do produto " + i + ": R$ " + preco + "\n";
				}

				output += "Total: R$ " + total;

				System.out.println("Total: R$ " + total);

				System.out.println("Entre com o valor pago:");
				valorPago = scan.nextDouble();

				output += "Dinheiro: R$ " + valorPago + "\n";

				troco = total - valorPago;

				output += "Troco: R$ " + troco;

				System.out.println(output);

			} else {
				sair = true;
			}

		} while (!sair);

		scan.close();
	}

}
