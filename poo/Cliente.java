package Familia52.poo;

public class Cliente {

	private String nomeCliente;
	private String cpf;
	private String endereco;
	private String numeroCliente;
	
	
	public Cliente ( String nomeCliente,String cpf,String endereco, String numeroCliente) {
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.endereco = endereco;
		this.numeroCliente = numeroCliente;
		
	}
	
	public void mostrarInfo() {
		
		System.out.println("\nO cliente "+nomeCliente+", portador do CPF: "+cpf+", residente no endereço "+endereco+","
				+ " cujo o número de telefone é: "+numeroCliente+" foi premiado!!!");
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	
	
	
}
