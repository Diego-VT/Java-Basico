package Atividades_14_15;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int var1 = ler.nextInt();
		
		System.out.println("Informe outro numero: ");
		int var2 = ler.nextInt();
		
		System.out.println("Informe operação a ser realizada (+ - * /): ");
		String ope = ler.next();
		
		double res = 0;
		
		switch(ope) {
			case "+" : res = var1 + var2;
			break;
			case "-" : res = var1 - var2;
			break;
			case "*" : res = var1 * var2;
			break;
			case "/" : res = var1 / var2;
			break;
			default:
			System.out.println("Valor invalido");
		}
		System.out.println("Valor da operação e: " + res);
		
		
		ler.close();

	}

}
