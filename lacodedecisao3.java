package Familia52;

import java.util.Scanner;

public class lacodedecisao3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Informe sua idade: ");
		idade = leia.nextInt();
		
		if(idade <= 10 && idade <14 ) {
			System.out.println("\nSua categoria � infantil");
		}
		else if(idade >= 15 && idade<=17) {
			System.out.println("\nSua categoria � juvenil");
		}
		else {
			System.out.println("\nSua categoria � Adulto");
		}
		
		

	}

}
