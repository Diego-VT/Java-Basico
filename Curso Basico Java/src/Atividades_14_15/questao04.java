/*Faça um Programa que verifique se uma letra digitada é vogal ou 
consoante.*/
package Atividades_14_15;

import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um letra: ");
		String letra = ler.next();
		
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") ||
		   letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") ) {
			System.out.println("É uma Vogal");
		}else {
			System.out.println("É uma consoante");
		}
		
		System.out.println("***********************Utilizando Switch****************************");
		
		switch(letra) {
		case"a":
		case"e":
		case"i":
		case"o":
		case"u":
		case"A":
		case"E":
		case"I":
		case"O":
		case"U":
			System.out.println("É uma Vogal");
			;break;
			default:
				System.out.println("É uma consoante");
		}
		
		
		
		
		ler.close();

	}

}
