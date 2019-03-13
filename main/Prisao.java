package main;

public class Prisao extends Posicoes{

	public Prisao(String nome, double valor) {
		super(nome, valor);
	}
	
	public String tipo() {
		return this.getNome();
	}	
}
