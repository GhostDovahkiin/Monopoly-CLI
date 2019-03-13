package main;

public class PontoDePartida extends Posicoes{

	public PontoDePartida(String nome, double valor) {
		super(nome, valor);
	}
	
	public String tipo() {
		return this.getNome();
	}	
}
