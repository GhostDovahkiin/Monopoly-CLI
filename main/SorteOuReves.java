package main;

public class SorteOuReves extends Posicoes{
	private Baralho baralhoCartas;

	public SorteOuReves(String nome, double valor) {
		super(nome, valor);
	}

	public Baralho getBaralhoCartas() {
		return baralhoCartas;
	}

	public void setBaralhoCartas(Baralho baralhoCartas) {
		this.baralhoCartas = baralhoCartas;
	}
	
	public String tipo() {
		return this.getNome();
	}	
	

}
