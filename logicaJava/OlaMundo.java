package Familia52.logicaJava;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		double n1,n2,n3,media;
		int op;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInforme a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nInforme a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nInforme a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		System.out.println("\nMédia aritmética: "+media);
		System.out.printf("\nMédia aritmética: %.2f",media);
		
		if(media >= 5 && media <= 10) {
			System.out.println("\nAluno aprovado!!!");
			
		}
		else if(media>= 5 && media<7) {
			System.out.println("\nAluno de exame!!!");
		}
		else {
			System.out.println("\nAluno reprovado!!!");
		}
		
		n1 = Math.sqrt(n2);
		n2 = Math.pow(n3, 3);
		System.out.println("\n\t\tMenu de elogios!!! ");
		System.out.println("\n1-Familia muito comprenetrada!!! ");
		System.out.println("\n2-Família muito unida!!! ");
		System.out.println("\n3-Família muito criativa!!! ");
		System.out.println("\n4-Família muito gentil!!! ");
		System.out.println("\nEscolha sua opção!!! ");
		op = leia.nextInt();
		
		switch(op){
		case 1:
			System.out.println("\n-1 Familia muito comprenetrada!!!");
			break;
		case 2:
			System.out.println("\n2-Família muito unida!!!");
			break;
		case 3:
			System.out.println("\n3-Família muito criativa!!!");
			break;
		case 4:
			System.out.println("\n4-Família muito gentil!!!");
			break;
			default:
				System.out.println("\nOpção Inválida");
	
		
		
		}
	}

}
