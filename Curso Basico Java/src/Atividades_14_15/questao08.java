/* Faça um programa que pergunte o preço de três produtos e informe 
qual produto você deve comprar, sabendo que a decisão é sempre 
pelo mais barato.*/
package Atividades_14_15;

import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite primeiro Preço: ");
		double preco1 = ler.nextDouble();
		
		System.out.println("Digite primeiro Preço: ");
		double preco2 = ler.nextDouble();
		
		System.out.println("Digite primeiro Preço: ");
		double preco3 = ler.nextDouble();
		
		double menor=0;
		
		if(preco1 <= preco2 && preco1 <= preco3) {
			menor = preco1;
		}else if(preco2 <= preco1 && preco2 <= preco3) {
			menor = preco2;
		}else {
			menor = preco3;
		}
		
		System.out.println("Menor preço e " + menor);
		ler.close();

	}

}
