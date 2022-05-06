package Familia52;

import java.util.Scanner;

public class lacodedecisao1 {

	public static void main(String[] args) {
		
		int n1,n2,n3,Nmaior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o primeiro valor: ");
		n1 = leia.nextInt();
		System.out.println("\nInforme o segundo valor: ");
		n2 = leia.nextInt();
		System.out.println("\nInforme o quarto valor: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 ) {
			Nmaior = n1;
			System.out.println("\nO número maior é "+Nmaior);
		}
		
		else if(n2 < n1) {
			Nmaior = n2;
			System.out.println("\nO número maior é "+Nmaior);
		}
		else {
			Nmaior = n3;
			System.out.println("\nO número maior é "+Nmaior);
		}
	}

}
