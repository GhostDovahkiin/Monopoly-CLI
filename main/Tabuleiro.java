package main;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tabuleiro {
	private ArrayList<Posicoes> posicoes;
	private Baralho baralho;
	private LinkedList<Jogador> jogadores;
	private Dado dado1, dado2;
	private LinkedList<Posicoes> tabuleiroDone;
	
	public Tabuleiro() {
		this.posicoes = new ArrayList<Posicoes>(40);
		this.baralho = new Baralho();
		this.jogadores = new LinkedList<Jogador>();
		this.dado1 = new Dado();
		this.dado2 = new Dado();
		this.tabuleiroDone = new LinkedList<Posicoes>();
	}
	/**
	 * Monta o tabuleiro, Seta as posições ao mesmo.
	 */
	public void montarTabuleiro( ){
		for(int i = 0; i < this.posicoes.size(); i++) {
			this.tabuleiroDone.add(i, posicoes.get(i));
		}
	}
	/**
	 * 
	 * @param Posição específica
	 * Adiciona as posições na linked list de posição
	 */
	public void adicionaPosicao(Posicoes p) {
		this.posicoes.add(p);
	}
	/**
	 * 
	 * @param j1 jogador um é o primeiro jogador a passar suas informações.
	 * @throws Exception Se o jogador 2 for igual ao jogador 1, ele lança uma exceção.
	 */
	public void adicionaJogador(Jogador j1) throws Exception {
		Jogador j2 = pesquisaJogador(j1.getNome());
		if(j2 == null) {
			this.jogadores.add(j1);
		}else {
			throw new Exception("Jogador "+j1.getNome()+" já existe.");
		}
	}
	/**
	 * 
	 * @param jogadorPesquisado Nome do jogador que é inserido.
	 * @return retorna o jogador se não tiver com mesmo nome.
	 * @throws Exception Se existir um jogador com o mesmo nome, ele lança a exceção. 
	 */
	public Jogador pesquisaJogador(String jogadorPesquisado) throws Exception{
		Jogador jogadorRetorno = null;
		boolean retorno = false;
		for(Jogador j:this.getJogadores()) {
			if(j.getNome().toLowerCase().equals(jogadorPesquisado.toLowerCase())) {
				retorno = true;
				jogadorRetorno = j;
			}
		}
		if(retorno == false) {
			return jogadorRetorno;
		}else {
			throw new Exception("Jogador " +jogadorPesquisado+" já existe, tente novamente com outro nome");
		}
	}
	
	public ArrayList<Posicoes> getPosicoes() {
		return posicoes;
	}

	public void setPosicoes(ArrayList<Posicoes> posicoes) {
		this.posicoes = posicoes;
	}

	public Baralho getBaralho() {
		return baralho;
	}

	public void setBaralho(Baralho baralho) {
		this.baralho = baralho;
	}

	public LinkedList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(LinkedList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Dado getDado1() {
		return dado1;
	}

	public void setDado1(Dado dado1) {
		this.dado1 = dado1;
	}

	public Dado getDado2() {
		return dado2;
	}

	public void setDado2(Dado dado2) {
		this.dado2 = dado2;
	}

	public LinkedList<Posicoes> getTabuleiro() {
		return tabuleiroDone;
	}

	public void setTabuleiro(LinkedList<Posicoes> tabuleiro) {
		this.tabuleiroDone = tabuleiro;
	}
}
