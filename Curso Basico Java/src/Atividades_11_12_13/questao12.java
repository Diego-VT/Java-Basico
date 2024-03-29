/*Tendo como dados de entrada a altura de uma pessoa, construa um 
algoritmo que calcule seu peso ideal, usando a seguinte fórmula: 
(72.7*altura) - 58*/
package Atividades_11_12_13;

import java.util.Scanner;

public class questao12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua Altura: ");
		double altura = ler.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Peso Ideal é: " + pesoIdeal);
		
		ler.close();

	}

}
