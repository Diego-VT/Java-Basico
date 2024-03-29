/*Faça um Programa que pergunte quanto você ganha por hora e o 
número de horas trabalhadas no mês. Calcule e mostre o total do seu 
salário no referido mês*/
package Atividades_11_12_13;

import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		Scanner ler = new  Scanner (System.in);
		
		System.out.println("Valor por horas: ");
		double vlr_hora = ler.nextDouble();
		
		System.out.println("Horas trabalhada: ");
		double horas = ler.nextDouble();
		
		double salario = vlr_hora * horas;
		
		System.out.println("Salario mensal e: " + salario);
		
		ler.close();

	}

}
