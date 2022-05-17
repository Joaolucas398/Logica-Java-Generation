package Familia52.poo.herancaEPolimorfismo;

public class Preguica extends Animal{
	

	
	
	public Preguica (String nomeAnimal,int idadeAnimal) {
		
		super(nomeAnimal,idadeAnimal);
	
		
	}
	
	
	@Override
	public void somAnimal() {
		System.out.println(this.getNomeAnimal()+ "AAA... AAAA.. AAA... !!!");
	}
	
	public void acaoAnimal() {
		System.out.println("Zzzzzz...!!!");
		
	}
	

}
