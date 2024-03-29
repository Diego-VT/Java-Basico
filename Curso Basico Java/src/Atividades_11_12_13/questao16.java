package Atividades_11_12_13;

import java.util.Scanner;

public class questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Pedir ao usuário o tamanho da área a ser pintada em metros quadrados
	        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
	        double areaASerPintada = scanner.nextDouble();

	        // Calcular a quantidade de litros de tinta necessários
	        double litrosDeTinta = areaASerPintada / 3.0;

	        // Calcular a quantidade de latas de tinta necessárias (sem Math.ceil)
	        int latasDeTinta = (int) (litrosDeTinta / 18.0); // Converter para int para arredondar para baixo
	        if (litrosDeTinta % 18.0 != 0) { // Se houver uma fração, adicionar 1
	            latasDeTinta++;
	        }

	        // Calcular o preço total das latas de tinta
	        double precoTotal = latasDeTinta * 80.0;

	        // Exibir o resultado para o usuário
	        System.out.println("Quantidade de latas de tinta necessárias: " + latasDeTinta);
	        System.out.println("Preço total: R$ " + precoTotal);

	        scanner.close();
	    }
	}