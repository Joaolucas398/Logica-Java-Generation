package Familia52.poo.heranca;

public class Animal {
	
	private String nomeAnimal;
	private int idadeAnimal;
	
	
	
	
	public Animal(String nomeAnimal,int idadeAnimal) {
		super();
		this.nomeAnimal = nomeAnimal;
		this.idadeAnimal = idadeAnimal;
		
		
		
	}
	
	public void somAnimal() {
		
		System.out.println("AAAA AAAAA AAAAAA");
		
	}
	

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}


	


}
