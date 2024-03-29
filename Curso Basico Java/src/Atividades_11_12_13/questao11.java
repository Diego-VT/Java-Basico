package Atividades_11_12_13;

import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite primeiro numero inteiro: ");
		int num1 = ler.nextInt();
		
		System.out.println("Digite segundo inteiro: ");
		int num2 = ler.nextInt();
		
		System.out.println("Digite numero real: ");
		double num3 = ler.nextDouble();
		
		double produto = (2 * num1 * num1) + (num2 / 2);
		double soma = (3 * num1) + num3;
		double cubo = num3 * num3 * num3;
		
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + produto);
		System.out.println("a soma do triplo do primeiro com o terceiro: " + soma);
		System.out.println("O terceiro número elevado ao cubo é: " + cubo);
		
		ler.close();

	}

}
