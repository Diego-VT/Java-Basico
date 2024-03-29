/*Faca um programa no qual ao ser executado deverá solictar ao usuário:

1. Digite um valor do tipo byte:

2. Digite um valor do tipo short:

3. Digite um valor do tipo int:

4. Digite um valor do tipo long:

5. Digite um valor do tipo float:

6.  Digite um valor do tipo double:

7. Digite um valor do tipo char:

E Depois mostre na tela todos os valores digitados.*/

package Atividade_IFTO;


import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);	                     
	
		
		System.out.println("Dgite um valor do tipo Byte, do tipo Short, do tipo Int, do tipo Long, do tipo Float, do tipo Double, tipo Char:");
		byte var1 = ler.nextByte();
		short var2 = ler.nextShort();
		int var3 = ler.nextInt();
		long var4 = ler.nextLong();
		float var5 = ler.nextFloat();
		double var6 = ler.nextDouble();
		char var7 = ler.next().charAt(0);
		
		System.out.println("Valor do tipo Byte digitado foi: " + var1);
		System.out.println("Valor do tipo Short foi: " + var2);
		System.out.println("Valor do tipo Int foi: " + var3);
		System.out.println("Valor do tipo Long foi: " + var4);
		System.out.println("Valor do tipo Float foi: " + var5);
		System.out.println("Valor do tipo Double foi: " + var6);
		System.out.println("Valor do tipo Char foi: " + var7);
		
		
		ler.close();

	}

}
