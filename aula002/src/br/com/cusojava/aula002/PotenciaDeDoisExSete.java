package br.com.cusojava.aula002;

import java.util.Scanner;

public class PotenciaDeDoisExSete {
	public static void main(String[] args) {
		
		Scanner potencia = new Scanner(System.in);
		System.out.println("Descubra a potência de 2 de um número.");
		double numero = potencia.nextInt();
		
		double pow = Math.pow(numero, 2);
		
		System.out.printf("O valor de %.2f elevado a 2 é igual a: %.2f.", numero, pow);
	
		potencia.close();
		
		
	
	}
}
