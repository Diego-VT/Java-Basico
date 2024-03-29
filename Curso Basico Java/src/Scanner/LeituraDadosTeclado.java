package Scanner;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = ler.nextLine();

		System.out.println("Nome digitado e " + nome);

		ler.close();

	}

}
