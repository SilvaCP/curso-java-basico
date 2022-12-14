/**
 * @author carlos 
 * Ano: 2015.
 * Aumentos salariais de 1.5%
 * */
package com.carlos.cursojavabasico.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salario = 1000; //1996
		double percentual = 1.5; //1996
		salario += (salario/100) * percentual; //1996
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for(int i = 1997; i <= 2015; i ++) {
			percentual *= 2; 
			salario += (salario/100) * percentual;
			System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
			
		}
		
		
		
		
		
		
		scan.close();
	}

}
