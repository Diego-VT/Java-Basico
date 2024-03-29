/*Faça um programa no qual o usuário digite 4 números e o seu programa deverá informar qual o maior e o menor número que digitado pelo usuário.*/
package Atividade_IFTO;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int maior = 0;
		int menor = 99999;

		System.out.println("Digite um 1º valor: ");
		int num1 = ler.nextInt();

		System.out.println("Digite um 2º valor: ");
		int num2 = ler.nextInt();

		System.out.println("Digite um 3º valor: ");
		int num3 = ler.nextInt();

		System.out.println("Digite um 4º valor: ");
		int num4 = ler.nextInt();

		if (num1 > maior) {
			maior = num1;
		}
		if (num2 > maior) {
			maior = num2;
		}
		if (num3 > maior) {
			maior = num3;
		}
		if (num4 > maior) {
			maior = num4;
		}
		if (num1 < menor) {
			menor = num1;
		}
		if (num2 < menor) {
			menor = num2;
		}
		if (num3 < menor) {
			menor = num3;
		}
		if (num4 < menor) {
			menor = num4;
		}
		System.out.println("Maior é " + maior);
		System.out.println("Menor é " + menor);

		ler.close();

	}

}
