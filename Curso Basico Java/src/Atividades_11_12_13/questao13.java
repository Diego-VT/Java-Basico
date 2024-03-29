package Atividades_11_12_13;

import java.util.Scanner;

public class questao13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner("System.in");
		
		System.out.print("Digite sua altura:");
		double altura = ler.nextDouble();
		
		System.out.print("Digite seu sexo:");
		char sexo = ler.next().charAt(0);
		
		double pesoIdeal=0;
		
		if(sexo == 'M' || sexo == 'm') {
			 pesoIdeal = (72.7 * altura) - 58;
		}
		else if(sexo == 'F' || sexo == 'f') {
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		else {
			System.out.println("Sexo invalido.");	
		
	
		}
		
		System.out.println("Seu peso e: " + pesoIdeal);
		
		ler.close();

	}

}
