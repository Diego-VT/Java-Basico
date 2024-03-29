/*1. Faça um Programa que peça dois números e imprima o maior deles.*/

package Atividades_14_15;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = ler.nextInt();
		
		System.out.println("Digite outro numero: ");
		int num2 = ler.nextInt();
		
		if(num1 > num2) {
			System.out.println(" Primeiro numero é Maior");
		}
		else if (num1 < num2) {
			System.out.println(" O segundo numero é Maior");
		}else {
			System.out.println("Os numeros são iguais.");
		}

		ler.close();

	}

}
