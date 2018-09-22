package br.com.cusojava.aula002;

import java.util.Scanner;

public class ExercicioOnze {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		int idadeMinima = Integer.parseInt(teclado.nextLine());
	
		
		if (idadeMinima >= 18){
			System.out.println("Você pode fazer a CNH!");
			
		}else {
			System.out.println("É ermetido fazer a CNH apenas para maiores de 18 anos.");
		}
		teclado.close();
		}
	}
