package Atividades_14_15;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Informe um dia da semana de 1-7");
	int dia = ler.nextInt();
	
	switch(dia) {
	case 1:
		System.out.println("Domingo");
		break;
	case 2:
		System.out.println("Segunda Feira");
		break;
	case 3:
		System.out.println("Terça Feira");
		break;
	case 4:
		System.out.println("Quarta Feira");
		break;
	case 5:
		System.out.println("Quinta Feira");
		break;
	case 6:
		System.out.println("Sexta Feira");
		break;
	case 7:
		System.out.println("Sabado");
		break;
		default:
			System.out.println("Dia Invalido");
	}
	
	
	ler.close();

	}

}
