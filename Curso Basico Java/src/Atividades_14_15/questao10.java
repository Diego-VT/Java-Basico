/*Faça um Programa que pergunte em que turno você estuda. Peça 
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a 
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor 
Inválido!", conforme o caso*/

package Atividades_14_15;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o turno que estuda: ");
		String turno = ler.next();
		
		System.out.println("****************************opção utilizando Switch case******************************");
		
		switch(turno) {
		case "m":
		case "M":
			System.out.println("Matutino");
			break;
		case "v":
		case "V":
			System.out.println("Vespetino");
			break;
		case "n":
		case "N":
			System.out.println("Noturno");
			break;
		default:
			System.out.println("Opção Invalida");
		}
		
		System.out.println("**********************Opção utilizando if e else*************************************");
		
		if(turno.equalsIgnoreCase("m")) {
			System.out.println("Matutino");
		}else if(turno.equalsIgnoreCase("v")) {
			System.out.println("Vespetino");
		}else if(turno.equalsIgnoreCase("n")) {
			System.out.println("Noturno");
		}else {
			System.out.println("Opção Invalida");
		}
		
		ler.close();

	}

}
