/*10.Faça um Programa que peça a temperatura em graus Celsius, 
transforme e mostre em graus Farenheit.*/
package Atividades_11_12_13;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double c = ler.nextDouble();
		
		double farenheit = (c * 9 / 5) + 32;
		
		System.out.println("A temperatura em farenheit: " + farenheit);
		
		ler.close();
		
	}

}
