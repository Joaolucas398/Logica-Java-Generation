package Familia52.poo.heranca;

public class Cavalo extends Animal {
	
	
	private String acaoAnimal;
	
	
	public Cavalo (String nomeAnimal,String idadeAnimal, String somAnimal, String acaoAnimal) {
		
		super(nomeAnimal,idadeAnimal,somAnimal);
		this.acaoAnimal = acaoAnimal;
		
	}
	
	



	public String getAcaoAnimal() {
		return acaoAnimal;
	}


	public void setAcaoAnimal(String acaoAnimal) {
		this.acaoAnimal = acaoAnimal;
	}

	
	
}
