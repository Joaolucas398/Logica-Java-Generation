package Familia52.poo.Collections;

import java.util.ArrayList;
import java.util.Scanner;



public class Loja {
	
	

	public static void main(String[] args) {
		
		int op;
		
		Scanner leia= new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do{
			System.out.println("\n\t\tMenu de Opções");
			System.out.println("\n1- Adicionar um produto no estoque?");
			System.out.println("\n2- Remover um produto do estoque?");
			System.out.println("\n3- Atualizar um produto do estoque?");
			System.out.println("\n4- Mostrar todos os produtos do estoque?");
			System.out.println("\n5- Encerrar o programa?\n");
			System.out.println("Digite sua opção: ");
			op = leia.nextInt();
			
			switch(op){
			//Armazenando dados
			case 1:
				leia.nextLine();
				System.out.println("\nInforme qual produto será adicionado ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
			break;
			//Removendo dados
			case 2:
				leia.nextLine();
				System.out.println("\nInforme qual produto será removido do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto inesxistente!");
				}
				System.out.println("\nEstoque após a remoção do produto...");
				System.out.println(estoque);
			break;
			//Atualizando dados
			case 3:
				leia.nextLine();
				System.out.println("\nInforme qual produto será atualizado: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o produto que irá entrar no lugar do produto "+verifica+" : " );
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto inesxistente dentro do estoque!!!");
				}
			break;
			//Apresentação dos produtos do estoque
			case 4:
				System.out.println("\nOs produtos no estoque: ");
				System.out.println(estoque);
			break;
			//opção para encerrar o programa
			case 5:
				System.out.println("\nFinalizou o programa!");
			break;
				default:
					System.out.println("Opção inválida!");
			}
			
		}while(op!=0);

	}


		
}

//Lembrete//
// Frizar o ArrayList, importar sua biblioteca e o uso dos comandos "add, remove e contains"//

