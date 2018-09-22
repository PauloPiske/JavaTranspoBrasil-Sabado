package br.com.cusojava.aula002;

import java.util.Scanner;

public class ProdutoDesconto {
	public static void main(String[] args) {

		System.out.println("Apresente o valor do produto e o desconto desejado.");

		Scanner produto = new Scanner(System.in);

		System.out.println("Informe o nome do produto:");
		String nomeproduto = produto.nextLine();

		System.out.println("Informe o valor do produto:");
		String valor = produto.nextLine();

		double valor1 = Double.parseDouble(valor);

		System.out.println("Informe o desconto desejado:");
		String desconto = produto.nextLine();

		double desconto2 = Double.parseDouble(desconto);

		double resultado = valor1 - (valor1 * desconto2) / 100;

		System.out.printf("O valor do %s é %f.\n", nomeproduto, valor1);
		System.out.printf("O %s custa %.2f, com %.2f%% de desconto fica %.2f.", nomeproduto, valor1, desconto2,
				resultado);

	}

}
