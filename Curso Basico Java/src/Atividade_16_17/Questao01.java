package Atividade_16_17;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		boolean notaValida = false;

		do {
			System.out.println("Informe uma nota: ");
			double nota = ler.nextDouble();

			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Nota digitada foi " + nota);
			} 
			else {
				System.out.println("Nota invalida");
			}
		} while (!notaValida);

		

		ler.close();

	}

}
