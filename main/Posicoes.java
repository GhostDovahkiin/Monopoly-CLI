package main;
/**
 * Classe abstrata, onde a mesma destina todos os atributos de uma posição. Outras classes devem estender da mesma.
 * @author lucas
 *
 */
public abstract class Posicoes {
	private String nome;
	private Double valor;
	private boolean disponivel;
	
	public Posicoes(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		this.disponivel = true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String toString() {
		return "Nome: "+this.nome+"\nValor: "+this.valor;
	}

	public void setDisponivel(boolean b) {
		this.disponivel = b;
	}
	
	public boolean isDisponivel() {
		return this.disponivel;
	}

}
