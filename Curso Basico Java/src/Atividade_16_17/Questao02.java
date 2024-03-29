package Atividade_16_17;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		boolean infoValidas = false;
		
		do {
			System.out.print("Digite nome do usuario: ");
			String nome = ler.next();
			
			System.out.print("Digite a senha: ");
			String senha = ler.next();
			
			if(nome.equalsIgnoreCase(senha)) {
				infoValidas=false;
				System.out.println("Senha igual ao usuario, digite novamente");				
			}
			else {
				infoValidas=true;
				System.out.println("Senha e usuarios válidos");
			}
			
		}while(!infoValidas);
		
		
		ler.close();

	}

}
