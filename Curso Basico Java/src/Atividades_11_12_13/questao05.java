/* Faça um Programa que converta metros para centímetros.*/

package Atividades_11_12_13;

import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite valor em Metros para converter em centímetros:");
		double metros = ler.nextDouble();
		
		double centimentros = metros * 100;
		
		System.out.println("Quantidade de Centímetros e: " + centimentros);
		
		ler.close();

	}

}
