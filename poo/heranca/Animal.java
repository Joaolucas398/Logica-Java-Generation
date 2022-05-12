package Familia52.poo.heranca;

public class Animal {
	
	private String nomeAnimal;
	private String idadeAnimal;
	private String somAnimal;
	
	public Animal(String nomeAnimal,String idadeAnimal, String somAnimal) {
		super();
		this.nomeAnimal = nomeAnimal;
		this.idadeAnimal = idadeAnimal;
		this.somAnimal = somAnimal;
		
	}
	

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(String idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}


	public String getSomAnimal() {
		return somAnimal;
	}


	public void setSomAnimal(String somAnimal) {
		this.somAnimal = somAnimal;
	}



}
