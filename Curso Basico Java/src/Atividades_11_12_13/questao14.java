package Atividades_11_12_13;

import java.util.Scanner;

public class questao14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o Peso do Peixe: ");
		double peso_peixe = ler.nextDouble();
		
		double peso_execedido, multa;
		
		if(peso_peixe > 50) {
			peso_execedido= peso_peixe - 50;
			multa= 4 * peso_execedido;
			System.out.println("O Peso execedido é: " +peso_execedido+"KG o valor da multa é R$:" +multa);
			
		}else {
			System.out.println("Não houve execesso no peso do peixe.");
		}
		
		
		ler.close();

	}

}
