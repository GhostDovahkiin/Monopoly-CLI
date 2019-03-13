package main;

 

public class ParadaLivre extends Posicoes {
	
	public ParadaLivre(String nome, double valor) {
		super(nome, valor);
	}

	public String tipo() {
		return this.getNome();
	}	
}
