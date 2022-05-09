package Familia52;

import java.util.Scanner;

public class DoWhileNumeroTeclado {

	public static void main(String[] args) {
		
		int n,soma=0;
		
		Scanner leia = new Scanner (System.in);
		
		
		do {
			System.out.println("\nDigite um número: ");
			n = leia.nextInt();
				
				soma+=n;
			
			
			
		}while(n!=0);
		System.out.println("\n A soma dos números digitados é: "+soma);
	}

}
