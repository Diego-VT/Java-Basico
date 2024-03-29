/*Faça um Programa que peça o raio de um círculo, calcule e mostre 
sua área.*/
package Atividades_11_12_13;

import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final double PI = 3.14;
		
		System.out.println("Digite valor do raio do círculo: ");
		double raio = ler.nextDouble();
		
		double area = PI * (raio * raio);
		
		System.out.println("O valor da area e " + area);
		
		
		
		ler.close();

	}

}
