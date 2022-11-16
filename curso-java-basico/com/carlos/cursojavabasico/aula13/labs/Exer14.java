package com.carlos.cursojavabasico.aula13.labs;

import java.util.Scanner;

/*
 * @author Carlos.
 * Faça um programa que peça o tamanho de um arquivo para download (em MB)
 * e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo
 * aproximado de download do arquivo usando este link (em minutos). 
 * */
public class Exer14 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo: ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Informe a velocidade da Internet: ");
		double velocidadeLink = scan.nextDouble();
		
		double tempoDeDownload = tamanhoArquivo / velocidadeLink;
		
		System.out.println("Tempo aproximado do Download é: " + tempoDeDownload);
		
		scan.close();
	}

}
