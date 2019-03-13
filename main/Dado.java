package main;

 

import java.util.Random;

public class Dado {
	private int dado;
	
	public Dado() {
		this.dado = 0;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}
	/**
	 * 
	 * @return retorna o numero que foi sorteado de 1 a 6.
	 */
	public int jogada() {
		Random random = new Random();
		this.dado = random.nextInt(6) + 1;
		return dado;
	}
}
