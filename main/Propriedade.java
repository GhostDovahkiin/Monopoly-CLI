package main;
/**
 *Classe que contem os atributos das proprpiedades que estão contidas no tabuleiro.
 */
public class Propriedade extends Posicoes{
	private double preco;
	private double aluguel;

	public Propriedade(String nome, double valor) {
		super(nome, valor);
		this.setAluguel(0);
		this.setPreco(0);
	}

	public double getAluguel() {
		return aluguel;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String tipo() {
		return this.getClass().getSimpleName();
	}
	
}
