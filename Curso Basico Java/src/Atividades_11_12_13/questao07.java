/*Faça um Programa que calcule a área de um quadrado, em seguida 
mostre o dobro desta área para o usuário.*/
package Atividades_11_12_13;

import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do lado do quadrado: ");
		double lado = ler.nextDouble();
		
		double area = lado * lado;
		
		System.out.println("A área do quadrado é: " + area);
		
		ler.close();

	}

}
