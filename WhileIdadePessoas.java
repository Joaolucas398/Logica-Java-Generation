package Familia52;

import java.util.Scanner;

public class WhileIdadePessoas {

	public static void main(String[] args) {
		int idade=0,menos21=0,mais50=0;
		
		Scanner leia = new Scanner (System.in);
		

		while(idade<99) {
			System.out.println("\nInforme sua idade: ");
			idade = leia.nextInt();
			
			
			if(idade <=21) {
				
				menos21++;
				
			}
			else if(idade > 50) {
				
				mais50++;
			}
		}

		System.out.println("\n Total de Pessoas com idade menor ou igual a 21 anos: "+menos21);
		System.out.println("\n Total de Pessoas com idade maior a 50 anos: "+mais50);
	}

}
