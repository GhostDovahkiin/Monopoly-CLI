package main;

public class ImpostoDeRenda extends Posicoes{
	
	public ImpostoDeRenda(String nome, double valor) {
		super(nome, valor);	
	}

	@Override
	public String tipo() {
		return this.getNome();
	}	
}
