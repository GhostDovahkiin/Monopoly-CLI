package main;

public class LucrosOuDividendo extends Posicoes{
	
	public LucrosOuDividendo(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public String tipo() {
		return this.getNome();
	}	
}
