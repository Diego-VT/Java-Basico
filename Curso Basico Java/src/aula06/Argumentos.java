package aula06;

import java.util.Scanner;

public class Argumentos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = ler.next();
		
		System.out.println("Nome digitado e " + nome);
		
		ler.close();

	}

}
