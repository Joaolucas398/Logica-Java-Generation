package Familia52.Arrays;

import java.util.Scanner;

public class array4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float[][] matriz1 = new float [2][2];
		float[][] matriz2 = new float [2][2];
		float[][] matriz3 = new float [2][2];
		float N=0;
		int i,j,op;
		
		for(i=0; i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nInforme os valores da matriz 1: ");
				matriz1[i][j] = leia.nextFloat();
				System.out.println("\nInforme os valores da matriz 2: ");
				matriz2[i][j] = leia.nextFloat();
				
			}
		}
		
		do {
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n1- Somar as duas matrizes");
			System.out.println("\n2- Subtrair a primeira matriz da segunda matriz");
			System.out.println("\n3- Adicionar uma variável as duas matrizes");
			System.out.println("\n4- Imprimir as matrizes");
			System.out.println("\n0- Digite a sua opção");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
			
		
			
		switch(op) 
		{

		case 1:
			for(i=0; i<2;i++) {
				for(j=0;j<2;j++) {
					
					matriz3[i][j] = matriz1[i][j]+matriz2[i][j];
					System.out.println("\nSoma das matrizes: "+matriz3[i][j]);
				}
			}
		break;
		case 2:
			for(i=0; i<2;i++) {
				for(j=0;j<2;j++) {
					
					matriz3[i][j] = matriz2[i][j]-matriz1[i][j];
					System.out.println("\nA subtração da matrizes 2 da matriz 1: "+matriz3[i][j]);
				}
			}
		break;
		case 3:
			System.out.println("\nInforme o valor: ");
			N = leia.nextFloat();
			
			for(i=0; i<2;i++) {
				for(j=0;j<2;j++) {
					matriz1[i][j] += N;
					matriz2[i][j] += N;
					System.out.println("\nMatriz 1: "+matriz1[i][j]);
					System.out.println("\nMatriz 1: "+matriz2[i][j]);
				}
			}
		break;
		case 4:
			for(i=0; i<2;i++) {
				for(j=0;j<2;j++) {
					
					System.out.println("\nMatriz 1: "+matriz1[i][j]);
					System.out.println("\nMatriz 1: "+matriz2[i][j]);
					
				}
			}
		break;
		case 0:
			System.out.println("\nMuito obrigado por utilizar nosso programa!!!");
		break;
		default:
			System.out.println("\nOpção inválida!");
			
		}
		}while(op!=0 );
		
		
	}

}
