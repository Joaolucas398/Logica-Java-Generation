package Familia52.lacoRepeticao;

import java.util.Scanner;

public class ForNumerosParesEImpar {

	public static void main(String[] args) {
	
	int x,n,qntPar=0,qntImpar=0;
	Scanner leia = new Scanner(System.in);
	
	for(x=0; x<10; x++) {
		
		System.out.println("\nInforme um número inteiro: ");
		n = leia.nextInt();
		
		if(n%2==0) {
			qntPar++;
			
		}
		else {
			qntImpar++;
		}
		
		
		
	}
	System.out.println("\nA quantidade de números pares é: "+ qntPar);
	System.out.println("\nA quantidade de números impares é: "+ qntImpar);

	}

}
