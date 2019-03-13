package main;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * Classe onde estão contidos os atributos de Jogador e todos os seus métodos.
 *
 */
public class Jogador {
	private String nome;
	private String cor;
	private double saldo;
	private int posicao;
	private ArrayList<Propriedade> propriedadesProprias;
	private ArrayList<Companhia> companhiasProprias;
	private boolean temCarta;
	private boolean preso;
	
	public Jogador(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
		this.setSaldo(1500);
		this.setPropriedadesProprias(new ArrayList<Propriedade>());
		this.setCompanhiasProprias(new ArrayList<Companhia>());
		this.temCarta = false;
		this.posicao = 0;
		this.preso = false;
	}
	
	public Jogador(String nome) {
		this.nome = nome;
		this.preso = false;
		this.temCarta = false;
		this.cor = "";
		this.setSaldo(1500);
		this.setCompanhiasProprias(new ArrayList<Companhia>());
		this.setPropriedadesProprias(new ArrayList<Propriedade>());
		this.posicao = 0;
	}
	
	/** 
	 * @param recebe a posição que o usuario está
	 * Aqui tira o valor da compra, quando a mesma é efetuada.
	 */
	public void compra(Posicoes p) {
		this.saldo -= p.getValor();
	}

	public void pagueReves(double valor) {
		this.setSaldo(this.getSaldo()-valor);
	}
	
	public void recebaReves(double valor) {
		this.setSaldo(this.getSaldo()+valor);
	}
	
	/**
	 * 
	 * @return retorna as propriedades do usuario
	 */
	public String propriedadesString(){
		String propriedades = "";
		for(Propriedade p:this.propriedadesProprias) {
			propriedades += p.getNome()+" \n";
		}
		return propriedades;
	}
	
	public String companhiasString(){
		String companhias = "";
		for(Companhia c:this.companhiasProprias) {
			companhias += c.getNome()+" - Multiplicador: "+c.getMultiplicador()+"\n";
		}
		return companhias;
	}	
	
	public String toString() {
		return "O status de "+this.nome+" – "+this.cor+" é o seguinte: "
				+ "\nSituado na posição: "+this.posicao
				+"\nPossui "+this.saldo+"$ "
				+ "\nPropriedades: "+this.propriedadesString()
				+"Companhias: "+this.companhiasString()+"\nCarta de saída livre: "+this.isTemCarta();
	}
	
	/**
	 * Este método somente é usado para remover 50 de cada jogador e adicionar no jogador da vez, que recebeu a carta
	 * @param jogadores
	 * @param C
	 */
	public void recebeDeCada(LinkedList<Jogador> jogadores , Jogador C) {
		double contador =  0;
		for(Jogador p:jogadores) {
			contador += 50;
			if(C.getNome().equals(p.getNome())) {
				
			}else {
				p.pagueReves(50);
			}
			C.recebaReves(contador);
		}
	}
	
	public void mudaDisponivel(boolean valor) {
		for(Posicoes p: this.propriedadesProprias) {
			p.setDisponivel(valor);
		}		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Propriedade> getPropriedadesProprias() {
		return propriedadesProprias;
	}
	
	public void setPropriedadesProprias(ArrayList<Propriedade> p) {
		this.propriedadesProprias = p;
	}
	
	public ArrayList<Companhia> getCompanhiasProprias() {
		return companhiasProprias;
	}

	public void setCompanhiasProprias(ArrayList<Companhia> companhiasProprias) {
		this.companhiasProprias = companhiasProprias;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public int getPosicao() {
		return posicao;
	}

	public boolean isPreso() {
		return preso;
	}

	public void setPreso(boolean preso) {
		this.preso = preso;
	}
	
	public boolean isTemCarta() {
		return temCarta;
	}

	public void setTemCarta(boolean temCarta) {
		this.temCarta = temCarta;
	}
}
