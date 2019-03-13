package main;

public class Companhia extends Posicoes {
	private int multiplicador;
	Jogador dono;

	public Companhia(String nome, Double valor) {
		super(nome, valor);
	}

	public Companhia(String string, double d, int i) {
		super(string, d);
		this.multiplicador = i;
	}

	@Override
	public String tipo() {
		return this.getClass().getSimpleName();
	}

	public int getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}

	public Jogador getDono() {
		return dono;
	}

	public void setDono(Jogador dono) {
		this.dono = dono;
	}
}