/*As Organizações Tabajara resolveram dar um aumento de salário aos 
seus colaboradores e lhe contraram para desenvolver o programa que 
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o 
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o 
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento*/

package Atividades_14_15;

import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor do seu Salario: ");
		double salario = ler.nextDouble();
		
		double perc;
		
		if(salario <= 280) {
			perc = 0.2;
		}else if(salario > 280 && salario < 700) {
			perc = 0.15;
		}else if(salario >= 700 && salario < 1500) {
			perc = 0.10;
		}else {
			perc = 0.05;			
		}
		double aumento = salario * perc;
		double novoSalario = aumento + salario;
		
		System.out.println("O salário antes do reajuste é de " +salario);
		System.out.println("O percentual de aumento aplicado " + perc);
		System.out.println("O valor do aumento: " + aumento);
		System.out.println("O novo salário, após o aumento: " + novoSalario);
		
		
		
		
		ler.close();

	}

}
