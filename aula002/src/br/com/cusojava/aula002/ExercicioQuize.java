package br.com.cusojava.aula002;

import java.util.Scanner;

public class ExercicioQuize {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
	System.out.println("Informe o valor do seu sálário para saber o valor do Inss.");
	
	double salario = Double.parseDouble(teclado.nextLine());
	
	double descontoInss = salario *0.11;
	double salarioAposDescontoInss = salario *0.89;
	double aliquotaIr = 0;
	double descontoIr = 0;
	double salarioLiquido = 0;
	
	
	if(salarioAposDescontoInss >= 1800) {
		
		if(salarioAposDescontoInss <=2400) {
			aliquotaIr = 7.5;
		
		} else if(salarioAposDescontoInss <= 3600) {
			aliquotaIr = 24;
		
		} else {
			aliquotaIr = 32;
		}		
		
		}
	descontoIr = salarioAposDescontoInss * aliquotaIr /100;
	salarioLiquido = salarioAposDescontoInss - descontoIr;
	System.out.printf("Salario inicial R$%.2f, desconto INSS R$%.2f, percental desconto IRPF %.2f%% - R$%.2f, salário líquido: %.2f.\n", salario, descontoInss, aliquotaIr, descontoIr, salarioLiquido, args);
	teclado.close();
	}
	}
