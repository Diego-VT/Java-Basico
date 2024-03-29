package Atividades_14_15;

import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Solicita os três números do usuário
		System.out.println("Digite o primeiro número:");
		int numero1 = ler.nextInt();
		System.out.println("Digite o segundo número:");
		int numero2 = ler.nextInt();
		System.out.println("Digite o terceiro número:");
		int numero3 = ler.nextInt();

		// Ordena os números em ordem decrescente usando o algoritmo de seleção
		if (numero1 < numero2) {
			int temp = numero1;
			numero1 = numero2;
			numero2 = temp;
		}
		if (numero1 < numero3) {
			int temp = numero1;
			numero1 = numero3;
			numero3 = temp;
		}
		if (numero2 < numero3) {
			int temp = numero2;
			numero2 = numero3;
			numero3 = temp;
		}

		// Exibe os números em ordem decrescente
		System.out.println("Os números em ordem decrescente são: " + numero1 + ", " + numero2 + ", " + numero3);

		ler.close();

	}

}
