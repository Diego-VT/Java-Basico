package Atividades_14_15;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int num = ler.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("E par");
		}else {
			System.out.println("É impar");
		}
		
		
		ler.close();

	}

}
