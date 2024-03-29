/*. Faça um Programa que peça a temperatura em graus Farenheit, 
transforme e mostre a temperatura em graus Celsius.*/

package Atividades_11_12_13;

import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite graus em Farenheit: ");
		double f = ler.nextDouble();
		
		double celsius = (5 * (f-32)/9);
		
		System.out.println("Temperatura em Celsius é: " + celsius);
		
		
		
		ler.close();

	}

}
