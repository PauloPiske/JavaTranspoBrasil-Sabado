package br.com.cusojava.aula002;

import java.util.Scanner;

public class IdadeDias {
	
	public static void main(String[] args){
		
		System.out.println("Gostaria de saber quantos dias de vida você tem? \n");
		
		Scanner idade = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		String anos = idade.nextLine();
		
		int anos1 = Integer.parseInt(anos);
		
		int dias = 365;
		int quantidade = anos1 * dias;
		
		System.out.printf("Você tem %d dias de vida.", quantidade);
		
		idade.close();
		
		
	}
}
