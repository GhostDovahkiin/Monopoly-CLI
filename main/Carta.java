package main;

/**
 * Classe cartam, que tem seus atributos padrões e implementa a interface RevesCartas e seus métodos tipo() e toString()
 * @author Pedro H
 *
 */

public class Carta implements RevesCartas{
	private String descricao;
	private int receba;
	private int pague;
	private String tipo;
	
	public Carta(String descricao, int pague, int receba, String tipo) {
		this.descricao = descricao;
		this.receba = receba;
		this.pague = pague;
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "- "+this.descricao;
	}
	
	@Override
	public String tipo() {
		return this.tipo;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getReceba() {
		return receba;
	}
	public void setReceba(int receba) {
		this.receba = receba;
	}
	public double getPague() {
		return pague;
	}
	public void setPague(int pague) {
		this.pague = pague;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
