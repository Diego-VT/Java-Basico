package Atividade_16_17;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota = -1;
		
		while(nota < 0 || nota > 10) {
			System.out.println("Informe uma nota entre 0 e 10");
			nota = ler.nextInt();
			
			if(nota < 0 || nota > 10) {
				System.out.println("Valor informado e invalido");
			}
			
			
		}
		
		System.out.println("Nota digitada foi " + nota);
		
		
		ler.close();

	}

}
