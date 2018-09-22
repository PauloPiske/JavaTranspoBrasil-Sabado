package br.com.cusojava.aula002;

import java.util.Scanner;

public class AnoMesDia {
	public static void main(String[] args) {

		System.out.println("Informe quantos dias você tem?");

		Scanner idade = new Scanner(System.in);
		System.out.println("Qual sua idade exata?");
		int idade1 = idade.nextInt();

		// int ano = 360;
		// int mes = 30;
		// int dia = 1;

		int emAno = idade1 / 360;
		int emMes = idade1 % 360 / 30;
		int emDia = idade1 % 360 % 30;
		System.out.printf("Você tem %d anos, %d messes, %d dias de vida.", emAno, emMes, emDia);
	
	idade.close();
	
	}
}
