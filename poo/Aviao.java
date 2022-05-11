package Familia52.poo;

public class Aviao {
	
	private String nomeAviao;
	private String cor;
	private String qntDeCadeiras;
	private String compania;
	
	
	public Aviao ( String nomeAviao,String cor,String qntDeCadeiras, String compania) {
		this.nomeAviao = nomeAviao;
		this.cor = cor;
		this.qntDeCadeiras = qntDeCadeiras;
		this.compania = compania;
		
	}
	
	public void mostrarInfo() {
		
		System.out.println("\nO avião "+nomeAviao+", de cor "+cor+", com "+qntDeCadeiras
				+" cadeiras da compania "+compania+" está saindo!!!");
	}

	public String getNomeAviao() {
		return nomeAviao;
	}

	public void setNomeAviao(String nomeAviao) {
		this.nomeAviao = nomeAviao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getQntDeCadeiras() {
		return qntDeCadeiras;
	}

	public void setQntDeCadeiras(String qntDeCadeiras) {
		this.qntDeCadeiras = qntDeCadeiras;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	
	
	
	
}
