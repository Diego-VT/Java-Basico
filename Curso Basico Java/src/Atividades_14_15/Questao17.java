package Atividades_14_15;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o ano");

		int ano = scan.nextInt();

		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("é bissexto");
		} else {
			System.out.println("não é bissexto");
		}
		scan.close();
	}

}
