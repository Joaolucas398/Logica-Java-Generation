package Familia52.Arrays;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		
		int[] n= new int[6];
		
		int x,nPar=0,nImpar=0,somaPar=0,qntImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<6; x++) {
			
			System.out.println("\nInforme um número");
			n[x] = leia.nextInt();
			
			if(n[x] % 2 == 0 ) {
				
				nPar++;
				somaPar+=n[x];
			}
			else if(n[x] % 2 != 0) {
				System.out.println(n[x]);
				nImpar++;
				
				
			}
		
		
		}
		System.out.println("\nA quantidade de números pares digitados é: "+nPar);
		System.out.println("\nA soma dos números pares são: "+somaPar);
		System.out.println("\nA soma dos números impares são: "+nImpar);
		

	}

}
