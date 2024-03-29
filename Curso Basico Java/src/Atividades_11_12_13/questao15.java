package Atividades_11_12_13;

import java.util.Scanner;

public class questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe valor por hora de trabalho: ");
		double vlr_hora = ler.nextDouble();
		
		System.out.println("Horas trabalhada por mês: ");
		double hr_mes = ler.nextDouble();
		
		double salario_bt = vlr_hora * hr_mes;
		
		double imposto_renda = salario_bt * 0.11;
		double imposto_inss = salario_bt * 0.08;
		double imposto_sind = salario_bt * 0.05;
		
		double salario_liquido = salario_bt - imposto_renda - imposto_inss - imposto_sind;
		
		System.out.println("O salario bruto e R$: " +salario_bt);
		System.out.println("Valor de desconto do imposto de renda R$: " +imposto_renda);
		System.out.println("Valor de desconto do INSS R$: " +imposto_inss);
		System.out.println("Valor de desconto do imposto de renda R$: " +imposto_sind);
		System.out.println("O valor do salario liquido e R$: " +salario_liquido);
		
		
		ler.close();

	}

}
