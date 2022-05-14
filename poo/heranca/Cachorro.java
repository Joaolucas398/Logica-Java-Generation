package Familia52.poo.heranca;

public class Cachorro extends Animal {
	
	
	
	public Cachorro(String nomeAnimal,int idadeAnimal) {
		
		super(nomeAnimal,idadeAnimal);
		
	}
	@Override
	public void somAnimal() {
		System.out.println(this.getNomeAnimal()+ " AU AU AUUUU !!!");
	}
	
	public void acaoAnimal() {
		System.out.println("correeendooo... !!!");
		
	}


	
}
