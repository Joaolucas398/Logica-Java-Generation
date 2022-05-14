package Familia52.poo.heranca;

public class Cavalo extends Animal {
	
	
	
	
	public Cavalo (String nomeAnimal,int idadeAnimal) {
		
		super(nomeAnimal,idadeAnimal);
		
		
	}
	
	@Override
	public void somAnimal() {
		System.out.println(this.getNomeAnimal()+ " BRAASS BRASS...!!!");
	}
	
	public void acaoAnimal() {
		System.out.println("POCOTO... POCOTO...!!!");
		
	}
	
}
