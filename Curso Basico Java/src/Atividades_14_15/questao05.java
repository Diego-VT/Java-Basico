/*Faça um programa para a leitura de duas notas parciais de um aluno. 
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou 
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a 
dez.*/
package Atividades_14_15;

import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 1º Nota: ");
		double nota1 = ler.nextDouble();
		
		System.out.println("Digite 2º Nota: ");
		double nota2 = ler.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
	    String res = media == 10? "Aprovado com Distinção": media >=7? "Aprovado":"Reprovado";
	    System.out.println("Resultado " + res);
		
		
		ler.close();

	}

}
