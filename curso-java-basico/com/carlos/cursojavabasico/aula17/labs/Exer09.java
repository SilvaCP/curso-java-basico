/**
 * @author carlos
 * The program below print on screen only 
 * the odd numbers from 1 to 50.
 * */
package com.carlos.cursojavabasico.aula17.labs;

public class Exer09 {
	public static void main(String[] args) {
		for (int i = 1; i < 50; i++) {
			if(i % 2 != 0) {
			//	System.out.println(i);
				System.out.print(i + " "); // Exibe um ao lado do outro.
			}
		}
	}

}
